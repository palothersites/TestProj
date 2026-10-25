package com.example.testproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "hello World") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Friend") String name) {
        int hour = LocalTime.now().getHour();
        String greeting;
        if (hour < 12) {
            greeting = "Good Morning saurabh";
        } else if (hour < 17) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Evening";
        }
        return greeting + ", " + name + "!";
    }

    @GetMapping("/bye")
    public String bye(@RequestParam(defaultValue = "Friend") String name) {
        return "Goodbye, " + name + "! See you soon.";
    }

    @GetMapping("/health")
    public String health() {
        return "OK - Service is running";
    }

    @GetMapping("/bye-saurabh")
    public String bye(@RequestParam(defaultValue = "pal") String name) {
        return "Goodbye, " + name + "! See you soon saurabh pal.";
    }
    
}
