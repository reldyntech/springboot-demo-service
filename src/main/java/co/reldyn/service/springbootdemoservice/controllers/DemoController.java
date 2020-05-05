package co.reldyn.service.springbootdemoservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Alibaba Cloud Tech Meet 2020!";
    }

//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello World!";
//    }
}
