package model;

import javax.swing.JOptionPane;

public class Biblioteca {
    private Libro[] libros;
    private int posicion;
    public Biblioteca(int n) {
        libros = new Libro[n];
        posicion = 0;
    }

    // Agrega un libro a la biblioteca si hay espacio disponible
    public void addLibro(Libro libro) {
        if (posicion >= 0 && posicion < libros.length) {
            libros[posicion] = libro;
            this.posicion++;
        } else {
            JOptionPane.showMessageDialog(null, "Librería llena o posición inválida.");
        }
    }

    // Retorna el arreglo de libros en la biblioteca
    public Libro[] listarLibros() {
        return libros;
    }
}
