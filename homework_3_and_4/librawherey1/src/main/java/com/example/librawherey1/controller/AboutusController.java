package com.example.librawherey1.controller;

import com.example.librawherey1.model.Schools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/aboutus")

public class AboutusController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    ModelAndView index()
    {
        ModelAndView mav = new ModelAndView("aboutus");
        return mav;
    }

}
