package controller;

import model.Schools;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.SchoolsService;

import java.util.List;

@Controller
@RequestMapping("/home")
public class NewController {
    private final SchoolsService schoolsService;

    public NewController(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }

    @GetMapping
    public String showSchools(Model model){

        List<Schools> schools = this.schoolsService.findAll();
        model.addAttribute("schools", schools);

        return "home";
    }

//    TO-DO : vaka da go zememe shkoloto shto go odbral korisnikot.

//    @GetMapping("/home")
//    public String searchProducts(@RequestParam(required = false) String nameSearch, Model model) {
//
//    }
}
