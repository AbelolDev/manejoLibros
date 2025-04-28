package com.biblioteca.model;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class prestamo {

    private Integer id_prestamo;
    private Integer id_libro;
    private String run_solicitante;
    private String fecha_solicitud;
    private String fecha_entrega;
    private Integer cantidad_dias;
    private Integer multas;

    
}
