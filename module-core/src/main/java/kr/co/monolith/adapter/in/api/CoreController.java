package kr.co.monolith.adapter.in.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CoreController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
