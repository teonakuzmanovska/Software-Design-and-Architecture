package com.example.librawherey1.controller;


import com.example.librawherey1.model.Schools;
import com.example.librawherey1.service.SchoolsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class SchoolsController {

    private SchoolsService schoolsService;

    public SchoolsController(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }

// @RequestMapping
////    @GetMapping
//    String getHome(Model model)
//    {
//        List<Schools> schools = schoolsService.findAll();
//        model.addAttribute("schools", schools);
//
//        return "home";
//    }

@RequestMapping(method = RequestMethod.GET)
@ResponseBody
    ModelAndView index() {

        ModelAndView mav = new ModelAndView("home");
        List<Schools> schools = schoolsService.findAll();


//        mav.addObject("something", "0.1");
//        <h1 th:text="${something}"/>

        mav.addObject("schools", schools);
        return mav;

    }

}
