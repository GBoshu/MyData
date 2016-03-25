package com.boshu.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private static final String[] countries = { 
        "China", "US", "Japan"
    };
    
    @RequestMapping(value = "/form")
    public ModelAndView user() {
        ModelAndView modelAndView =
                new ModelAndView("userForm", "user", new User());
        modelAndView.addObject("genders", Gender.values());
        modelAndView.addObject("countries", countries);
        return modelAndView;
    }
    
    @RequestMapping(value = "/result")
    public ModelAndView processUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userResult");
        modelAndView.addObject("u", user);
        return modelAndView;
    }
}
