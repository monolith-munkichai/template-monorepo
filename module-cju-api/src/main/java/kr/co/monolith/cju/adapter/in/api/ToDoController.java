package kr.co.monolith.cju.adapter.in.api;


import kr.co.monolith.core.application.port.in.ToDoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoUseCase toDoUseCase;

    @GetMapping
    public void addTodo() {
        toDoUseCase.addTodo("TEST");
    }

}
