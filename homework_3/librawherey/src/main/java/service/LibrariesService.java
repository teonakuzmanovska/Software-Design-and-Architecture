package service;

import model.Libraries;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface LibrariesService {

    List<Libraries> findAll();
    List<Libraries> passNearbyLibraries();

}
