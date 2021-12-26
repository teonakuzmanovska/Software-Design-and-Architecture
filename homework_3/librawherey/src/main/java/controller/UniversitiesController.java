package controller;

import model.Universities;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UniversitiesService;

import java.util.List;

@RestController
@RequestMapping("/api/universities")

public class UniversitiesController {
    private final UniversitiesService universitiesService;

    public UniversitiesController(UniversitiesService universitiesService) {
        this.universitiesService = universitiesService;
    }

    @GetMapping
    public List<Universities> findAll() {
        return this.universitiesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Universities> findById(@PathVariable Long id) {
        return this.universitiesService.findById(id)
                .map(manufacturer -> ResponseEntity.ok().body(manufacturer))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    String getUniversities(Model model){
        List<Universities> universities = universitiesService.findAll();
        model.addAttribute("universities", universities);

        return "home";
    }

}
