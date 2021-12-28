package com.example.demo.librawherey.service.impl;

import com.example.demo.librawherey.repository.LibrariesRepository;
import com.example.demo.librawherey.service.LibrariesService;
import com.example.demo.librawherey.model.Libraries;
import com.example.demo.librawherey.model.Schools;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibrariesServiceImplementation implements LibrariesService {
    private final LibrariesRepository librariesRepository;

    public LibrariesServiceImplementation(LibrariesRepository librariesRepository) {
        this.librariesRepository = librariesRepository;
    }

    @Override
    public List<Libraries> passNearbyLibraries(){

        // vo ovaa lista gi chuvame isfiltriranite biblioteki
        List<Libraries> within5km = libraries.stream()
                .filter(l -> haversine(l.getLat(), l.getLon(), selectedLocation.getLat(), selectedLocation.getLon()) <= 5)
                .collect(Collectors.toList());


        return within5km;
    }


    @Override
    public List<Libraries> findAll() { return this.librariesRepository.findAll(); }


    Collection<Libraries> libraries;



    // TO-DO: ovde gi prenesuvame podatocite izvlecheni od frontend preku kontrolerot
    Schools selectedLocation;

    public static double haversine(double latLibrary, double lonLibrary, double latLocation, double lonLocation) {

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
