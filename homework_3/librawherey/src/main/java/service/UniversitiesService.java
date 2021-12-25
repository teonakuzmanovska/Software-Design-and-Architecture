package service;

import model.Universities;

import java.util.List;
import java.util.Optional;

public interface UniversitiesService {

    List<Universities> findAll();

    Optional<Universities> findById(Long id);
}
