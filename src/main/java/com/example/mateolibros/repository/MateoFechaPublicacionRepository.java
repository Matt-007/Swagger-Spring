package com.example.mateolibros.repository;

import com.example.mateolibros.entity.MateoFechaPublicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateoFechaPublicacionRepository extends JpaRepository<MateoFechaPublicacion, Long> {
    void deleteByComentarios(String comentarios);
}
