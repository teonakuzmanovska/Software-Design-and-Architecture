package service.impl;

import model.Schools;
import org.springframework.stereotype.Service;
import repository.jpa.SchoolsRepository;
import service.SchoolsService;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolsServiceImplementation implements SchoolsService {

    private final SchoolsRepository schoolsRepository;

    public SchoolsServiceImplementation(SchoolsRepository schoolsRepository) {
        this.schoolsRepository = schoolsRepository;
    }

    @Override
    public List<Schools> findAll() {
        return this.schoolsRepository.findAll();
    }

//    @Override
//    public Optional<Schools> findById(Long id) {
//        return this.schoolsRepository.findById(id);
//    }


}
