package com.sysco.msod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
    public String home() {
        return homeWithName(null);
    }
	
    @RequestMapping("/{username}")
    public String homeWithName(@PathVariable("username") String username) {
        return String.format("Welcome, %s", username == null ? "Everyone" : username);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
