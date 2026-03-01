package com.example.librawherey.service.impl;


import com.example.librawherey.model.Schools;
import com.example.librawherey.repository.SchoolsRepository;
import com.example.librawherey.service.SchoolsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SchoolsServiceImpl implements SchoolsService {

    private final SchoolsRepository schoolsRepository;

    public SchoolsServiceImpl(SchoolsRepository schoolsRepository) {
        this.schoolsRepository = schoolsRepository;
    }

    @Override
    public ArrayList<Schools> findAll() {
        return (ArrayList<Schools>) this.schoolsRepository.findAll();
    }

}
