package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
// 过滤加载bean包
@ComponentScan({"org.example.dao","org.example.service"})
/*@ComponentScan(value = "org.example",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = Controller.class
        ))*/
public class SpringConfig {
}
