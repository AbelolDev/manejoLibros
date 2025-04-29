package com.biblioteca.manejoLibros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.manejoLibros.model.Libro;
import com.biblioteca.manejoLibros.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardarLibro(libro);
    }

    public Libro getLibroById(Integer id) {
        return libroRepository.buscarPorId(id);
    }

    public String deleteLibro(Integer id) {
        libroRepository.eliminarLibro(id);
        return "Prestamo eliminado con exito";
    }

    public Libro updateLibro(Libro lib, Integer id) {
        return libroRepository.actualizarLibro(lib, id);
    }
}
