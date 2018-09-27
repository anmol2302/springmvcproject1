package com.stackroute.controller;

import com.stackroute.modal.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String invitation(ModelMap map) {
        User ob=new User("anmol");
        map.addAttribute("invitation",ob);
        return "index";
    }
}