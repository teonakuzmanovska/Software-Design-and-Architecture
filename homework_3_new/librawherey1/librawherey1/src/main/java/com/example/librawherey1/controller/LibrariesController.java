//package com.example.librawherey1.controller;
//
//
//import com.example.librawherey1.model.Libraries;
//import com.example.librawherey1.service.LibrariesService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/home")
//public class LibrariesController {
//    private final LibrariesService librariesService;
//
//    public LibrariesController(LibrariesService librariesService) {
//        this.librariesService = librariesService;
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    @ResponseBody
//    ModelAndView nearbyLibraries() {
//
//        ModelAndView mav = new ModelAndView("home");
//        List<Libraries> libraries = librariesService.passNearbyLibraries();
//        mav.addObject("libraries", libraries);
//
//        return mav;
//    }
//
//}
