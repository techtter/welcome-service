package net.techtter.aws.cicd.example.welcomeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/welcome")
public class WelcomeServiceApplication {

    @GetMapping
    public String getWelcomeMessage() {
        return "<h1 Welcome to TECHTTER Channel...!! </h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(WelcomeServiceApplication.class, args);
    }

}
