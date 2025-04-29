package com.biblioteca.manejoLibros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.manejoLibros.model.Libro;
import com.biblioteca.manejoLibros.service.LibroService;


@RestController
@RequestMapping("/api/v1/prestamos")
public class api {

    @Autowired
    private LibroService libroService;

    @GetMapping("/guardar_prestamo")
    public Libro guardarPrestamo(@RequestParam Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("/listar_libro")
    public List<Libro> listarPrestamos() {
        return libroService.getLibros();
    }

    @GetMapping("/buscar_libro")
    public Libro buscarPrestamo(@RequestParam Integer id) {
        return libroService.getLibroById(id);
    }

    @GetMapping("/eliminar_libro")
    public String eliminarPrestamo(@RequestParam Integer id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/actualizar_libro")
    public Libro actualizarPrestamo(@RequestParam Libro libro, @RequestParam Integer id) {
        return libroService.updateLibro(libro, id);
    }
}










