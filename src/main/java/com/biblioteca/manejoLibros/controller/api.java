package com.biblioteca.manejoLibros.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.prestamo;

@RestController
public class api {

    ArrayList<prestamo> prestamos = new ArrayList<>();

    @GetMapping("/api/v1/prestamos/guardar_prestamo")
    public String guardarPrestamo(
        @RequestParam(value = "id_prestamo", required = true) int id_prestamo,
        @RequestParam(value = "id_libro", required = true) int id_libro,
        @RequestParam(value = "run_solicitante", required = true) String run_solicitante,
        @RequestParam(value = "fecha_solicitud", required = true) String fecha_solicitud,
        @RequestParam(value = "fecha_entrega", required = true) String fecha_entrega,
        @RequestParam(value = "cantidad_dias", required = true) int cantidad_dias,
        @RequestParam(value = "multas", required = true) int multas) {

        prestamo prestamoInstance = new prestamo();
        prestamoInstance.setId_prestamo(id_prestamo);
        prestamoInstance.setId_libro(id_libro);
        prestamoInstance.setRun_solicitante(run_solicitante);
        prestamoInstance.setFecha_solicitud(fecha_solicitud);
        prestamoInstance.setFecha_entrega(fecha_entrega);
        prestamoInstance.setCantidad_dias(cantidad_dias);
        prestamoInstance.setMultas(multas);
        prestamos.add(prestamoInstance);
        return "Prestamo guardado: " + prestamoInstance.toString();
    }

    @GetMapping("/api/v1/prestamos/listar_prestamos")
    public String listarPrestamos() {
        if (prestamos.isEmpty() == false) {
            StringBuilder sb = new StringBuilder();
        for (prestamo prestamo : prestamos) {
            sb.append(prestamo.toString()).append("\n");
        }
        return sb.toString();   
        } 
        else {
            return "No hay prestamos registrados";
        }
    }
}










