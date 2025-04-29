package com.biblioteca.manejoLibros.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    private Integer id_prestamo;
    private Integer id_libro;
    private String run_solicitante;
    private String fecha_solicitud;
    private String fecha_entrega;
    private Integer cantidad_dias;
    private Integer multas;
    
}
