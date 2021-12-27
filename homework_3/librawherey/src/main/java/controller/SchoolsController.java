package controller;

import model.Libraries;
import model.Schools;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.SchoolsService;

import java.util.List;

@Controller
@RequestMapping("/home") // ovde vaka treba?

public class SchoolsController {

    private SchoolsService schoolsService;

    public SchoolsController(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }


//    istiot kontroler, samo so poinakva sintaksa

//    @GetMapping
//    public String showSchools(Model model){
//        List<Schools> schools = schoolsService.findAll();
//        model.addAttribute("schools", schools);
//
//        return "home";
//    }



//  kontroler za polnenje na dropdown lista na frontend

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    ModelAndView showSchools() {

        ModelAndView mav = new ModelAndView("home");
        List<Schools> schools = schoolsService.findAll();
        mav.addObject("schools", schools);

        return mav;
    }

//    TO-DO: staj kontroler za zimanje na odbrano shkolo od frontend

}
