package com.example.librawherey.service;

import com.example.librawherey.model.Libraries;

import java.util.ArrayList;

public interface LibrariesService {

    ArrayList<Libraries> findAll();
    ArrayList<Libraries> passNearbyLibraries(ArrayList<Libraries> libraries, Double tLat, Double tLon);

}
