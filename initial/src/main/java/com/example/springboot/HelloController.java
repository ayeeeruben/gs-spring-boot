package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/greeting")
  public String index() {
    return "Greetings from Spring Boot!";
  }
   @GetMapping("/hey")
  public String hey() {
    return "wasss poppinggg!";
  }

}
