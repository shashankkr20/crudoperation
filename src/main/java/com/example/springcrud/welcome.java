package com.example.springcrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping("/")
    public String print(){
        return "Welcome";
    }
}
