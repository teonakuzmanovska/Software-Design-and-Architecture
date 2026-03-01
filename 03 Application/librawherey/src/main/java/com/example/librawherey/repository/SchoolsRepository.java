package com.example.librawherey.repository;

import com.example.librawherey.model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends JpaRepository<Schools, Long> {
}
