package com.example.mateolibros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mateolibros.entity.*;
import com.example.mateolibros.service.MateoBibliotecaService;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/biblioteca")
@Tag(name = "MateoBibliotecaController", description = "Biblioteca Controller")
public class MateoBibliotecaController {

    @Autowired
    private MateoBibliotecaService bibliotecaService;

    @GetMapping("/libros")
    @Operation(summary = "Obtener todos los libros", description = "Retorna una lista de todos los libros")
    public List<MateoLibro> findAllLibros() {
        return bibliotecaService.getLibros();
    }

    @PostMapping("/libros")
    @Operation(summary = "Crear un nuevo libro", description = "Crea un nuevo libro con la información proporcionada")
    public MateoLibro createLibro(
            @Parameter(description = "Información del libro a crear", required = true) @RequestBody MateoLibro libro) {
        return bibliotecaService.saveLibro(libro);
    }

    @PutMapping("/libros/{id}")
    @Operation(summary = "Actualizar un libro", description = "Actualiza un libro existente con el ID proporcionado")
    public MateoLibro updateLibro(
            @Parameter(description = "ID del libro a actualizar", required = true) @PathVariable Long id,
            @Parameter(description = "Información actualizada del libro", required = true) @RequestBody MateoLibro libro) {
        return bibliotecaService.updateLibro(id, libro);
    }

    @DeleteMapping("/libros")
    @Operation(summary = "Eliminar un libro por nombre", description = "Elimina un libro existente por su nombre")
    public void deleteLibroByNombre(
            @Parameter(description = "Nombre del libro a eliminar", required = true) @RequestParam String nombre) {
        bibliotecaService.deleteLibroByNombre(nombre);
    }

    @PostMapping("/autores")
    @Operation(summary = "Crear un nuevo autor", description = "Crea un nuevo autor con la información proporcionada")
    public MateoAutor createAutor(
            @Parameter(description = "Información del autor a crear", required = true) @RequestBody MateoAutor autor) {
        return bibliotecaService.saveAutor(autor);
    }

    @PutMapping("/autores/{id}")
    @Operation(summary = "Actualizar un autor", description = "Actualiza un autor existente con el ID proporcionado")
    public MateoAutor updateAutor(
            @Parameter(description = "ID del autor a actualizar", required = true) @PathVariable Long id,
            @Parameter(description = "Información actualizada del autor", required = true) @RequestBody MateoAutor autor) {
        return bibliotecaService.updateAutor(id, autor);
    }

    @DeleteMapping("/autores")
    @Operation(summary = "Eliminar un autor por nombre", description = "Elimina un autor existente por su nombre")
    public void deleteAutorByNombre(
            @Parameter(description = "Nombre del autor a eliminar", required = true) @RequestParam String nombre) {
        bibliotecaService.deleteAutorByNombre(nombre);
    }

    @PostMapping("/generos")
    @Operation(summary = "Crear un nuevo género", description = "Crea un nuevo género con la información proporcionada")
    public MateoGenero createGenero(
            @Parameter(description = "Información del género a crear", required = true) @RequestBody MateoGenero genero) {
        return bibliotecaService.saveGenero(genero);
    }

    @PutMapping("/generos/{id}")
    @Operation(summary = "Actualizar un género", description = "Actualiza un género existente con el ID proporcionado")
    public MateoGenero updateGenero(
            @Parameter(description = "ID del género a actualizar", required = true) @PathVariable Long id,
            @Parameter(description = "Información actualizada del género", required = true) @RequestBody MateoGenero genero) {
        return bibliotecaService.updateGenero(id, genero);
    }

    @DeleteMapping("/generos")
    @Operation(summary = "Eliminar un género por nombre", description = "Elimina un género existente por su nombre")
    public void deleteGeneroByNombre(
            @Parameter(description = "Nombre del género a eliminar", required = true) @RequestParam String nombre) {
        bibliotecaService.deleteGeneroByNombre(nombre);
    }

    @GetMapping("/fechas_publicacion")
    @Operation(summary = "Obtener todas las fechas de publicación", description = "Retorna una lista de todas las fechas de publicación")
    public List<MateoFechaPublicacion> findAllFechasPublicacion() {
        return bibliotecaService.getFechasPublicacion();
    }

    @PostMapping("/fechas_publicacion")
    @Operation(summary = "Crear una nueva fecha de publicación", description = "Crea una nueva fecha de publicación con la información proporcionada")
    public MateoFechaPublicacion createFechaPublicacion(
            @Parameter(description = "Información de la fecha de publicación a crear", required = true) @RequestBody MateoFechaPublicacion fechaPublicacion) {
        return bibliotecaService.saveFechaPublicacion(fechaPublicacion);
    }

    @DeleteMapping("/fechas_publicacion/{id}")
    @Operation(summary = "Eliminar una fecha de publicación", description = "Elimina una fecha de publicación existente con el ID proporcionado")
    public void deleteFechaPublicacion(
            @Parameter(description = "ID de la fecha de publicación a eliminar", required = true) @PathVariable Long id) {
        bibliotecaService.deleteFechaPublicacion(id);
    }

    @DeleteMapping("/fechas_publicacion/comentarios")
    @Operation(summary = "Eliminar una fecha de publicación por comentarios", description = "Elimina una fecha de publicación existente con los comentarios proporcionados")
    public void deleteFechaPublicacionByComentarios(
            @Parameter(description = "Comentarios de la fecha de publicación a eliminar", required = true) @RequestParam String comentarios) {
        bibliotecaService.deleteFechaPublicacionByComentarios(comentarios);
    }
}
