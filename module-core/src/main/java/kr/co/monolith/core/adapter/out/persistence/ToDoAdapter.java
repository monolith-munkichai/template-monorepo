package kr.co.monolith.core.adapter.out.persistence;

import kr.co.monolith.core.application.port.out.ToDoPort;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class ToDoAdapter implements ToDoPort {

    @Override
    public void create(String memo) {

    }

}
