package com.example.springstudy.space.controller;

import com.example.springstudy.space.Mineral;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MineralController {
    @Qualifier("gold")
    private final Mineral gold;

    @GetMapping("/gold")
    public Mineral getGold(){
        return gold;
    }
}
