package com.example.demo.librawherey.controller;

import com.example.demo.librawherey.model.Libraries;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.librawherey.service.LibrariesService;

import java.util.List;

@Controller
@RequestMapping("/")

public class LibrariesController {

    private LibrariesService librariesService;

    public LibrariesController(LibrariesService librariesService) {
        this.librariesService = librariesService;
    }


//    istiot kontroler, samo so poinakva sintaksa

//    @GetMapping
////    public List<Libraries> passNearbyLibraries() { return this.librariesService.passNearbyLibraries(); }
//    public String showLibraries(Model model){
//        List<Libraries> libraries = librariesService.passNearbyLibraries();
//        model.addAttribute("libraries", libraries);
//
//        return "home";
//    }



//    kontroler za prenesuvanje na biblioteki na frontend

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    ModelAndView showLibraries() {

        ModelAndView mav = new ModelAndView("home");
        List<Libraries> libraries = librariesService.passNearbyLibraries();
        mav.addObject("libraries", libraries);

        return mav;
    }
}
