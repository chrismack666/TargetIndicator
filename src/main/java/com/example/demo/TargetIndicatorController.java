package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TargetIndicatorController {
    @RequestMapping("/")
    public String indicator() {
        return "targetIndicator";
    }

}
