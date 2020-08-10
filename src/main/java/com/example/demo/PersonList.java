package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonList {

    @GetMapping("/")
    public String getIndex() {
        return "Hello Siekny, Hok loves Siekny";
    }

    @GetMapping("/people")
    public String getPeople() {
        return "This is people";
    }

}
