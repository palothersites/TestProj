package com.example.testproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "hello World") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
