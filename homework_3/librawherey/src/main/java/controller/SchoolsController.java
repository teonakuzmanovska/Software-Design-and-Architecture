//package controller;
//
//import model.Schools;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import service.SchoolsService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/home") // ovde vaka treba?
//
//public class SchoolsController {
//
//    private SchoolsService schoolsService;
//
//    public SchoolsController(SchoolsService schoolsService) {
//        this.schoolsService = schoolsService;
//    }
//
//    @GetMapping
//    public String showSchools(Model model){
//        List<Schools> schools = schoolsService.findAll();
//        model.addAttribute("schools", schools);
//
//        return "home";
//    }
//
//}
