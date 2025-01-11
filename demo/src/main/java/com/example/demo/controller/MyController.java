package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
public class MyController {
    @GetMapping("/demo")
     public String demo()
     {
    	  return "My First Demo Application";
     }
}
