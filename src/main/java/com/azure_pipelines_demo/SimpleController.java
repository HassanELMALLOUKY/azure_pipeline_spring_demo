package com.azure_pipelines_demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping
    public String hello() {
        return "i'm build in Jenkins in EC2 Instance on AWS!";
    }
    @GetMapping("/test")
    public String test() {
        return "Test build in Jenkins!";
    }

}
