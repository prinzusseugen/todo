package com.example.todo.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TodoController {
    @GetMapping
    public String getTodo(){
        return "To-do Application!";
    }
}
