package com.jnu.guhaoat.mawen.controller;

import com.jnu.guhaoat.mawen.dto.PaginationDTO;
import com.jnu.guhaoat.mawen.dto.QuestionDTO;
import com.jnu.guhaoat.mawen.mapper.QuestionMapper;
import com.jnu.guhaoat.mawen.mapper.UserMapper;
import com.jnu.guhaoat.mawen.model.Question;
import com.jnu.guhaoat.mawen.model.User;
import com.jnu.guhaoat.mawen.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author guhao
 * @creat 2021-07-03 20:27
 */
@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;
    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name="page",defaultValue = "1")Integer page,
                        @RequestParam(name="size",defaultValue = "5")Integer size){
        PaginationDTO pagination= questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
