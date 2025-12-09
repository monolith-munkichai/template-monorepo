package kr.co.monolith.core.application.service;


import kr.co.monolith.core.application.port.in.ToDoUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ConditionalOnMissingBean(ToDoUseCase.class)
public class DefaultToDoService implements ToDoUseCase {

    @Override
    public void addTodo(String memo) {
        log.info("This is Core {}", memo);
    }
}
