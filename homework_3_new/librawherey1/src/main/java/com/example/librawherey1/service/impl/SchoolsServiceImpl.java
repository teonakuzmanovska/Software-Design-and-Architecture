package com.example.librawherey1.service.impl;


import com.example.librawherey1.model.Schools;
import com.example.librawherey1.repository.SchoolsRepository;
import com.example.librawherey1.service.SchoolsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolsServiceImpl implements SchoolsService {

    private final SchoolsRepository schoolsRepository;

    public SchoolsServiceImpl(SchoolsRepository schoolsRepository) {
        this.schoolsRepository = schoolsRepository;
    }

    @Override
    public List<Schools> findAll() {
        return this.schoolsRepository.findAll();
    }

}
