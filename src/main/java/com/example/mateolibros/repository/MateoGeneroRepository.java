package com.example.mateolibros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mateolibros.entity.MateoGenero;

@Repository
public interface MateoGeneroRepository extends JpaRepository<MateoGenero, Long> {
    void deleteByNombre(String nombre);
}
