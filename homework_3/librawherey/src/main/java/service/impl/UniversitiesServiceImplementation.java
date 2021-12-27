package service.impl;

import model.Universities;
import org.springframework.stereotype.Service;
import repository.jpa.UniversitiesRepository;
import service.UniversitiesService;

import java.util.List;
import java.util.Optional;

@Service
public class UniversitiesServiceImplementation implements UniversitiesService {

    private final UniversitiesRepository universitiesRepository;

    public UniversitiesServiceImplementation(UniversitiesRepository universitiesRepository) {
        this.universitiesRepository = universitiesRepository;
    }

    @Override
    public List<Universities> findAll() { return this.universitiesRepository.findAll(); }

    @Override
    public Optional<Universities> findById(Long id) {
        return this.universitiesRepository.findById(id);
    }

}
