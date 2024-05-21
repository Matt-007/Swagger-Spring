package com.example.mateolibros.service;

import com.example.mateolibros.entity.*;
import com.example.mateolibros.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateoBibliotecaService {

    @Autowired
    private MateoAutorRepository autorRepository;

    @Autowired
    private MateoGeneroRepository generoRepository;

    @Autowired
    private MateoLibroRepository libroRepository;

    @Autowired
    private MateoFechaPublicacionRepository fechaPublicacionRepository;

    // Métodos para la entidad Autor
    public List<MateoAutor> getAutores() {
        return autorRepository.findAll();
    }

    public MateoAutor saveAutor(MateoAutor autor) {
        return autorRepository.save(autor);
    }

    public MateoAutor updateAutor(Long id, MateoAutor autor) {
        Optional<MateoAutor> optionalAutor = autorRepository.findById(id);
        if (optionalAutor.isPresent()) {
            autor.setId(id);
            return autorRepository.save(autor);
        } else {
            return null;
        }
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
    
    public void deleteAutorByNombre(String nombre) {
        autorRepository.deleteByNombre(nombre);
    }

    // Métodos para la entidad Genero
    public List<MateoGenero> getGeneros() {
        return generoRepository.findAll();
    }

    public MateoGenero saveGenero(MateoGenero genero) {
        return generoRepository.save(genero);
    }

    public MateoGenero updateGenero(Long id, MateoGenero genero) {
        Optional<MateoGenero> optionalGenero = generoRepository.findById(id);
        if (optionalGenero.isPresent()) {
            genero.setId(id);
            return generoRepository.save(genero);
        } else {
            return null;
        }
    }

    public void deleteGenero(Long id) {
        generoRepository.deleteById(id);
    }
    
    public void deleteGeneroByNombre(String nombre) {
        generoRepository.deleteByNombre(nombre);
    }

    // Métodos para la entidad Libro
    public List<MateoLibro> getLibros() {
        return libroRepository.findAll();
    }

    public MateoLibro saveLibro(MateoLibro libro) {
        return libroRepository.save(libro);
    }

    public MateoLibro updateLibro(Long id, MateoLibro libro) {
        Optional<MateoLibro> optionalLibro = libroRepository.findById(id);
        if (optionalLibro.isPresent()) {
            libro.setId(id);
            return libroRepository.save(libro);
        } else {
            return null;
        }
    }

    public void deleteLibro(Long id) {
        libroRepository.deleteById(id);
    }
    
    public void deleteLibroByNombre(String nombre) {
        libroRepository.deleteByNombre(nombre);
    }

    // Métodos para la entidad FechaPublicacion
    public List<MateoFechaPublicacion> getFechasPublicacion() {
        return fechaPublicacionRepository.findAll();
    }

    public MateoFechaPublicacion saveFechaPublicacion(MateoFechaPublicacion fechaPublicacion) {
        return fechaPublicacionRepository.save(fechaPublicacion);
    }

    public void deleteFechaPublicacion(Long id) {
        fechaPublicacionRepository.deleteById(id);
    }

    public void deleteFechaPublicacionByComentarios(String comentarios) {
        fechaPublicacionRepository.deleteByComentarios(comentarios);
    }
}
