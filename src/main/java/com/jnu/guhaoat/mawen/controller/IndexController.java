package com.jnu.guhaoat.mawen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author guhao
 * @creat 2021-07-03 20:27
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
