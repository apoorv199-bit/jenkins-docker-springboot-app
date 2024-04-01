package com.jenkinsdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public Map<String,Object> getUsers() {
        Map<String,Object> data = new HashMap<>();
        data.put("Name","Apoorv");
        data.put("languages", Arrays.asList("Java","Python","JavaScript"));
        return data;
    }
}
