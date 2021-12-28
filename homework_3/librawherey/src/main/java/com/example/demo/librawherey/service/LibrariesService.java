package com.example.demo.librawherey.service;

import com.example.demo.librawherey.model.Libraries;

import java.util.List;

public interface LibrariesService {

    List<Libraries> findAll();
    List<Libraries> passNearbyLibraries();

}
