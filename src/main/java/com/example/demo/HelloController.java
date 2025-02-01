package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello Word c http://localhost:8080/";
    }

    @GetMapping("/user")
    public String usePage() {
        return "Hello Word user http://localhost:8080/";
    }

    @GetMapping("/admin")
    public String adminPange() {
        return "Hello Word admin http://localhost:8080/";
    }

}
