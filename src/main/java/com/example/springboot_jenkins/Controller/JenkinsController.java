package com.example.springboot_jenkins.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinsController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Jenkins";
    }
    @GetMapping("/bye")
    public String bye(){
        return "Bye Jenkins";
    }

}
