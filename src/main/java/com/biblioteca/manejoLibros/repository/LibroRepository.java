package com.biblioteca.manejoLibros.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.biblioteca.manejoLibros.model.Libro;

@Repository
public class LibroRepository {

    private final List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorId(Integer id) {
        for (Libro libro : listaLibros) {
            if (libro.getId_libro().equals(id)) {
                return libro;
            }
        }
        return null;
    }

    public Libro guardarLibro(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    public void eliminarLibro(Integer id) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
        }
    }

    public Libro actualizarLibro(Libro libroActualizado, Integer id) {
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libro = listaLibros.get(i);
            if (libro.getId_libro().equals(id)) {
                listaLibros.set(i, libroActualizado);
                return libroActualizado;
            }
        }
        return libroActualizado;
        }
        
}
