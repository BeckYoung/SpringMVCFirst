package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/info")
    @ResponseBody
    public String info() {
        System.out.println("UserController info...");
        return "{'info':'springmvc'}";
    }
}
