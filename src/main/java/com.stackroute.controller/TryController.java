package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TryController {
    @RequestMapping(value="/try")
    public String invitation( ModelMap map){
        map.addAttribute("invitation","welcome");
        return "index";
    }

}
