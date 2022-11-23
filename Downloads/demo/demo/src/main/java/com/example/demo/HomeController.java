package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/home-page")
    public ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/home-page");
        return modelAndView;
    }

    @GetMapping("/fragments/sidebar")
    public String getSidemenu() {
        return "/fragments/fragment-sidebar-menu.html";
    }

    @GetMapping("/fragments/mainmenu")
    public String getMainmenu() {
        return "/fragments/fragment-mainmenu-menu.html";
    }

    @GetMapping("/fragments/footer")
    public String getFooter() {
        return "/fragments/fragment-footer-content.html";
    }


}
