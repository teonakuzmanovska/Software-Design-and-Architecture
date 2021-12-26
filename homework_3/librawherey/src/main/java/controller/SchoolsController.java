package controller;

import model.Schools;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.SchoolsService;

import java.util.List;

@RestController
@RequestMapping("/api/schools") // ovde vaka treba?

public class SchoolsController {

    private SchoolsService schoolsService;

    public SchoolsController(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }

    @GetMapping
    public List<Schools> findAll(){
        return this.schoolsService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Schools> findById(@PathVariable Long id) {
        return this.schoolsService.findById(id)
                .map(schools -> ResponseEntity.ok().body(schools))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    String getSchools(Model model){
        List<Schools> schools = schoolsService.findAll();
        model.addAttribute("schools", schools);

        return "home";
    }

}
