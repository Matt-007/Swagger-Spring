package com.example.mateolibros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mateolibros.entity.MateoAutor;

@Repository
public interface MateoAutorRepository extends JpaRepository<MateoAutor, Long> {
    void deleteByNombre(String nombre);
}
