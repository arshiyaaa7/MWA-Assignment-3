package com.example.Servlet.ServletProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

    // Serves the JSP page with a dynamic message
    @GetMapping("/hello")
    public String showMessage(@RequestParam String msg, Model model) {
        model.addAttribute("message", msg);
        return "hello";  // Looks for hello.jsp
    }

    // Serves the plain message for the HTML fetch request
    @GetMapping("/api/message")
    @ResponseBody
    public String apiMessage() {
        return "Arshiya Says Hello!!";  // Returns a plain text response
    }
}
