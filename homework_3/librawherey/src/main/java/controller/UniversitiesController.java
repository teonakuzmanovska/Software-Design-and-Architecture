//package controller;
//
//import model.Universities;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import service.UniversitiesService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/home")
//
//public class UniversitiesController {
//    private final UniversitiesService universitiesService;
//
//    public UniversitiesController(UniversitiesService universitiesService) {
//        this.universitiesService = universitiesService;
//    }
//
//    @GetMapping
//    public String showUniversities(Model model){
//        List<Universities> universities = universitiesService.findAll();
//        model.addAttribute("universities", universities);
//
//        return "home";
//    }
//
//}

//TO-DO : trgni go kontrolerov, i trgni go kopcheto od html