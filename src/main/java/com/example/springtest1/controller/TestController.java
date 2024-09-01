package com.example.springtest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-connection")
public class TestController {
  @GetMapping("")
  public String greeting() {
    return "Hello, World";
  }
}
