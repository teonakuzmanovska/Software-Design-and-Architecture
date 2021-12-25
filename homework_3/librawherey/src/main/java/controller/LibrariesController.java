package controller;


import model.Libraries;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LibrariesService;

import java.util.List;

@RestController
@RequestMapping("/api/libraries")

public class LibrariesController {

    private LibrariesService librariesService;

    public LibrariesController(LibrariesService librariesService) {
        this.librariesService = librariesService;
    }

    @GetMapping
    public List<Libraries> findAll() {
        return this.librariesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libraries> findById(@PathVariable Long id) {
        return this.librariesService.findById(id)
                .map(libraries -> ResponseEntity.ok().body(libraries))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<Libraries> save(@RequestParam String name, @RequestParam String opening_hours, @RequestParam double lat, @RequestParam double lon) {
        return this.librariesService.save(name, opening_hours, lat, lon)
                .map(libraries -> ResponseEntity.ok().body(libraries))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }


}
