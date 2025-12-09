package kr.co.monolith.core.config;


import kr.co.monolith.core.application.port.in.ToDoUseCase;
import kr.co.monolith.core.application.service.DefaultToDoService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "kr.co.monolith.core")
public class ModuleConfig {

    @Bean
    @ConditionalOnMissingBean(ToDoUseCase.class)
    public ToDoUseCase defaultToDoService() {
        return new DefaultToDoService();
    }

}
