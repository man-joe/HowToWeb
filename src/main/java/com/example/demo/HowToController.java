package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HowToController {
    @RequestMapping("/")
    public String homePage(){
        return "HowToMain";
    }
    @RequestMapping("/DualBoot")
    public String dualBoot(){
        return "DualBoot";
    }
}
