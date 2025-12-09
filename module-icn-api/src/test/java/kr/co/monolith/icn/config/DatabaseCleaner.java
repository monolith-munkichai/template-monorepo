package kr.co.monolith.icn.config;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("test")
@RequiredArgsConstructor
public class DatabaseCleaner {
    private static final String FOREIGN_KEY_CHECK_FORMAT = "SET REFERENTIAL_INTEGRITY %d;";
    private static final String TRUNCATE_FORMAT = "TRUNCATE TABLE %s RESTART IDENTITY;";
    private final EntityManager entityManager;

    private final List<String> tableNames = new ArrayList<>();



    @SuppressWarnings("unchecked")
    @PostConstruct
    public void findDatabaseTableNames() {
        List<Object[]> tableInfos = entityManager.createNativeQuery("SHOW TABLES").getResultList();
        tableInfos.stream().map(tableInfo -> (String) tableInfo[0]).forEach(tableNames::add);
    }

    @Transactional
    public void clear() {
        entityManager.clear();
        truncate();
    }

    private void truncate() {
        entityManager.createNativeQuery(String.format(FOREIGN_KEY_CHECK_FORMAT, 0)).executeUpdate();

        tableNames.forEach(tableName -> entityManager.createNativeQuery(String.format(TRUNCATE_FORMAT, tableName)).executeUpdate());

        entityManager.createNativeQuery(String.format(FOREIGN_KEY_CHECK_FORMAT, 1)).executeUpdate();
    }
}
