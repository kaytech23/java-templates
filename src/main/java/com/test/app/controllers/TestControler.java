package com.test.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestControler {

    @GetMapping("/test")
    public String test() {
        return "Test!";
    }

    @GetMapping("/test1")
    public String test1() {
        return "Test1!";
    }

    @GetMapping("/test2")
    public String test2() {
        return "Test2!";
    }

    @GetMapping("/test3")
    public String test3() {
        return "Test3!";
    }

}
