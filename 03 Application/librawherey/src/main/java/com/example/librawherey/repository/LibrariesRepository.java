package com.example.librawherey.repository;

import com.example.librawherey.model.Libraries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrariesRepository extends JpaRepository<Libraries, Long> {
}
