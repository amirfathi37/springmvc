package com.fathi.controller;


import com.fathi.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @Autowired
    AddService addService;
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam int t1, @RequestParam int t2) {

        int s = addService.sum(t1, t2);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("res");
        mv.addObject("result", s);
        return mv;
    }
}
