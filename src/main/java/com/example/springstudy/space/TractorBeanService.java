package com.example.springstudy.space;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
@RequiredArgsConstructor
public class TractorBeanService {
    private final NavigationComputer compute;

    public void tractorBranSomething(String something) {
        String format = String.format("this %s ,using this path %s  ",
                something,
                compute.navigate());
        System.out.printf(format);
    }

    @PostConstruct
    public void done(){
        tractorBranSomething("x2");
    }


}
