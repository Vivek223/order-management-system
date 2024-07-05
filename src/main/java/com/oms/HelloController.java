package com.oms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/info")
    public String greet(){
        return "Welcome to the world of learning. We will learn Spring boot with Rest in this tutorial";
    }
}
