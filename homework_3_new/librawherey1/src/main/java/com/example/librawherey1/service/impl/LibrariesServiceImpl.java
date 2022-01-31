package com.example.librawherey1.service.impl;

import com.example.librawherey1.model.Libraries;
import com.example.librawherey1.model.Schools;
import com.example.librawherey1.repository.LibrariesRepository;
import com.example.librawherey1.service.LibrariesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class LibrariesServiceImpl implements LibrariesService {

    private final LibrariesRepository librariesRepository;

    public LibrariesServiceImpl(LibrariesRepository librariesRepository) {
        this.librariesRepository = librariesRepository;
    }

    @Override
    public ArrayList<Libraries> findAll() {
        return (ArrayList<Libraries>) this.librariesRepository.findAll();
    }

    public ArrayList<Libraries> passNearbyLibraries(ArrayList<Libraries> libraries, Double latSchool, Double lonSchool)
    {
        return (ArrayList<Libraries>) libraries.stream()
                .filter(l -> haversine(l.getLat(), l.getLon(), latSchool, lonSchool) <= 5)
                .collect(Collectors.toList());
    }

    public static double haversine(double latLibrary, double lonLibrary, double latLocation, double lonLocation)
    {
        int radius = 6371; // average radius of the earth in km

        double distanceLat = Math.toRadians(latLocation - latLibrary);
        double distanceLon = Math.toRadians(lonLocation - lonLibrary);

        double a = Math.sin(distanceLat / 2) * Math.sin(distanceLat / 2) +
                Math.cos(Math.toRadians(latLibrary)) * Math.cos(Math.toRadians(latLocation))
                        * Math.sin(distanceLon / 2) * Math.sin(distanceLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = radius * c;

        return distance;
    }

}
