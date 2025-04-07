package com.example.Servlet.ServletProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("api/message")
    public String getMessage() {
        return "Hello from the Backend!";
    }
}
