package com.biblioteca.manejoLibros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.manejoLibros.model.Libro;
import com.biblioteca.manejoLibros.service.LibroService;


@RestController
@RequestMapping("/api/v1/prestamos")
public class api {

    @Autowired
    private LibroService libroService;

    @PostMapping("/guardar_prestamo")
    public Libro guardarPrestamo(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("/listar_libro")
    public List<Libro> listarPrestamos() {
        return libroService.getLibros();
    }

    @GetMapping("/buscar_libro{id}")
    public Libro buscarPrestamo(@PathVariable Integer id) {
        return libroService.getLibroById(id);
    }

    @DeleteMapping("/eliminar_libro{id}")
    public String eliminarPrestamo(@PathVariable Integer id) {
        return libroService.deleteLibro(id);
    }

    @PutMapping("/actualizar_libro{id}")
    public Libro actualizarPrestamo(@RequestBody Libro libro, @PathVariable Integer id) {
        return libroService.updateLibro(libro, id);
    }
}










