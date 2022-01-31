package com.example.librawherey1.controller;


import com.example.librawherey1.model.Libraries;
import com.example.librawherey1.model.Schools;
import com.example.librawherey1.service.LibrariesService;
import com.example.librawherey1.service.SchoolsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")
public class HomeController {

    private SchoolsService schoolsService;
    private LibrariesService librariesService;


    public HomeController(SchoolsService schoolsService, LibrariesService librariesService) {
        this.schoolsService = schoolsService;
        this.librariesService = librariesService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    ModelAndView index() {

        ModelAndView mav = new ModelAndView("home");

        ArrayList<Schools> schools = schoolsService.findAll();
        mav.addObject("schools", schools);

        return mav;

    }

    // dobar li e metodov?

    @RequestMapping(method = RequestMethod.POST)
    ModelAndView save(@RequestParam Double tLat, @RequestParam Double tLon) {

        ModelAndView mav = new ModelAndView("home");

        ArrayList<Libraries> libraries = librariesService.findAll();

        ArrayList<Libraries> filteredLibraries = librariesService.passNearbyLibraries(libraries, tLat, tLon);
        mav.addObject("filteredLibraries", filteredLibraries);

        return mav;

    }

}
