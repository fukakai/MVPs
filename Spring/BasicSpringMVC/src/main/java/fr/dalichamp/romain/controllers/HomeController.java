package fr.dalichamp.romain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HomeController {
    private static final String HOME_PAGE = "home";

    @RequestMapping(method = RequestMethod.GET,path = "/")
    public String homePage(ModelMap mm){
        mm.addAttribute("title","Welcome Dude !");
        return HOME_PAGE;
    }
}
