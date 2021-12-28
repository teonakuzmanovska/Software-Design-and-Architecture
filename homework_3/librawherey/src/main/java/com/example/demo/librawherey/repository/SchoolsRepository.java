package com.example.demo.librawherey.repository;

import com.example.demo.librawherey.model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends JpaRepository<Schools, Long>{

}
