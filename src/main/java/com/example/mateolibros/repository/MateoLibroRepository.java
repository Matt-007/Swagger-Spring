package com.example.mateolibros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mateolibros.entity.MateoLibro;

@Repository
public interface MateoLibroRepository extends JpaRepository<MateoLibro, Long> {
    
      void deleteByNombre(String nombre);
    
    
}
