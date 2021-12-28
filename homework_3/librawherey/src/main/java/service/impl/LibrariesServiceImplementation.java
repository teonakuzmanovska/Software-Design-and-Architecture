package service.impl;

import repository.LibrariesRepository;
import service.LibrariesService;
import model.Libraries;
import model.Schools;
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
    public List<Libraries> findAll() { return this.librariesRepository.findAll(); }


    Collection<Libraries> libraries;



    // TO-DO: ovde gi prenesuvame podatocite izvlecheni od frontend preku kontrolerot
    Schools selectedLocation;

    // vo ovaa lista gi chuvame isfiltriranite biblioteki
    List<Libraries> within5km = libraries.stream()
            .filter(l -> haversine(l.getLat(), l.getLon(), selectedLocation.getLat(), selectedLocation.getLon()) <= 5)
            .collect(Collectors.toList());

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

    @Override
    public List<Libraries> passNearbyLibraries(){
        return within5km;
    }

}
