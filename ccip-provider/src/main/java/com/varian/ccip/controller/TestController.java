package com.varian.ccip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider/consul")
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
