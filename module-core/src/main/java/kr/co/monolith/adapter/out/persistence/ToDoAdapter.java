package kr.co.monolith.adapter.out.persistence;

import kr.co.monolith.application.port.out.ToDoPort;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class ToDoAdapter implements ToDoPort {

    @Override
    public void create(String memo) {

    }

}
