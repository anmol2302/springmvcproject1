package com.stackroute.controller;

import com.stackroute.modal.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


/**
 *
 */
@Controller
public class HomeController {

    /*
     * Create new user object for empty from
     */

    @ModelAttribute("login")
    public User setUpUserForm() {
        System.out.println("login chaa");
        return new User();
    }

    /*
     * Open new registration form
     */
    @GetMapping("/")
    public String registration() {

        return "registrationForm";
    }

    /*
     *  Save user object
     */
    @RequestMapping(value="/display",method = RequestMethod.POST)
    public String submit(@ModelAttribute("login")User login,
                         ModelMap model, @RequestParam("firstName") String firstName, @RequestParam("latName") String lastName, @RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email) {


        model.addAttribute("firstname", firstName);
        model.addAttribute("lastname", lastName);
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("email",email);
        return "registrationSuccess";
    }
}