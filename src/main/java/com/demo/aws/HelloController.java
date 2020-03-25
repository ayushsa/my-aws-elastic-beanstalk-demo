package com.demo.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/trigger")
@RestController
public class HelloController {

    @GetMapping("/test_1")
    public String hello_test_1() {
        return "Test 1 triggered";
    }
    
    @GetMapping("/test_2")
    public String hello_test_2() {
        return "Test 2 triggered";
    }
    
        @GetMapping("/test_3")
    public String hello_test_3() {
        return "Test 3 triggered";
    }
}
