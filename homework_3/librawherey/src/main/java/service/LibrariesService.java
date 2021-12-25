package service;

import model.Libraries;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface LibrariesService {
    List<Libraries> findAll();
    Optional<Libraries> findById(Long id);
    Optional<Libraries> save(String name, String opening_hours, double lat, double lon);
}
