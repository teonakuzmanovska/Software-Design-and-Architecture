package com.example.demo.librawherey.service.impl;

import com.example.demo.librawherey.model.Schools;
import org.springframework.stereotype.Service;
import com.example.demo.librawherey.repository.SchoolsRepository;
import com.example.demo.librawherey.service.SchoolsService;

import java.util.List;

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
