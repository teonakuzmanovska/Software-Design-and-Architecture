package com.example.demo.librawherey.repository;

import com.example.demo.librawherey.model.Libraries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrariesRepository extends JpaRepository<Libraries, Long> {

}
