package service;

import model.Libraries;

import java.util.List;

public interface LibrariesService {

    List<Libraries> findAll();
    List<Libraries> passNearbyLibraries();

}
