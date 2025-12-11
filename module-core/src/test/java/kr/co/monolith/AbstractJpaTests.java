package kr.co.monolith;

import jakarta.persistence.EntityManager;
import kr.co.monolith.config.DatabaseCleaner;
import kr.co.monolith.config.DatabaseClearExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ExtendWith(DatabaseClearExtension.class)
@Import(DatabaseCleaner.class)
public abstract class AbstractJpaTests {

    @Autowired
    public EntityManager entityManager;

    public static Long anyWorkflowId() {
        String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHH"));
        Random random = new Random();
        int i = random.nextInt(9999999);
        return Long.parseLong(String.format("%s%d",formatDate, i));
    }

    public static Long anyTicketNo() {
        String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHH"));
        Random random = new Random();
        int i = random.nextInt(99999);
        return Long.parseLong(String.format("%s%d",formatDate, i));
    }

}
