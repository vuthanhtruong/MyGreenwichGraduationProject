package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Configuration
public class ThymeleafConfig {

    @Bean
    public SpringResourceTemplateResolver templateResolver1() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/home/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(1);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver2() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/students/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(2);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver3() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/classes/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(3);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver4() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/timetable/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(4);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver5() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/Students/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(5);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver6() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/teachers/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(6);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver7() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/messages/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(7);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver8() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/rooms/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setOrder(8);
        resolver.setCheckExistence(true);
        return resolver;
    }

}
