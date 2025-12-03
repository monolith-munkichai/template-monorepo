package kr.co.monolith.cju.ticket;


import kr.co.monolith.common.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ApiController {

    private final TestService testService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
