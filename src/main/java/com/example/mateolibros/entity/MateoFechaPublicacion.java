package com.example.mateolibros.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "fechas_publicacion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MateoFechaPublicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "comentarios")
    private String comentarios;

    @Column(name = "is_publicado")
    private Boolean isPublicado;

    @Column(name = "numero_edicion")
    private Integer numeroEdicion;

    @ManyToOne
    @JoinColumn(name = "libro_id")
    private MateoLibro libro;
}
