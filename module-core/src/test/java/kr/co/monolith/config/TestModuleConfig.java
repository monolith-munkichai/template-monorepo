package kr.co.monolith.config;


import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@TestConfiguration
@ComponentScan(basePackages = "kr.co.monolith.core")
public class TestModuleConfig {

}
