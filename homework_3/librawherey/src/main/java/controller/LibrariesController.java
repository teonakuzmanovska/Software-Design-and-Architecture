//package controller;
//
//import model.Libraries;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import service.LibrariesService;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Controller
//@RequestMapping("/home")
//
//public class LibrariesController {
//
//    private LibrariesService librariesService;
//
//    public LibrariesController(LibrariesService librariesService) {
//        this.librariesService = librariesService;
//    }
//
//
//    @GetMapping
////    public List<Libraries> passNearbyLibraries() { return this.librariesService.passNearbyLibraries(); }
//    public String showLibraries(Model model){
//        List<Libraries> libraries = librariesService.passNearbyLibraries();
//        model.addAttribute("libraries", libraries);
//
//        return "home";
//    }
//}
