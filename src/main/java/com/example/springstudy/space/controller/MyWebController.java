package com.example.springstudy.space.controller;

import com.example.springstudy.space.Mineral;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class MyWebController {

    @GetMapping("/greeting")
    public String greeting() {
        return "hello";
    }

    @GetMapping("/mineral")
    public Mineral mineral() {
        return new Mineral(
                0,
                "gold"
        );
    }

}
