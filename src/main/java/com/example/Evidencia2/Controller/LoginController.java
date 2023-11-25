package com.example.Evidencia2.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "bmi-history";
    }

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "registration";
    }
}

