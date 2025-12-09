package kr.co.monolith.cju.application.service;


import kr.co.monolith.core.application.port.in.ToDoUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ToDoService implements ToDoUseCase {

    @Override
    public void addTodo(String memo) {
        log.info("This is CJU {}", memo);
    }

}
