package com.rohit.todo_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springramework.web.bind.annotation.RestController;

public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello from Spring Boot!";
        
    }
}