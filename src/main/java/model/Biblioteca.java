package model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Biblioteca {
    private Libro[] libros;
    private int posicion;
    public Biblioteca(int n) {
        libros = new Libro[n];
        posicion = 0;
    }

    public void addLibro(Libro libro) {
        if (posicion >= 0 && posicion < libros.length) {
            libros[posicion] = libro;
            this.posicion++;
            JOptionPane.showMessageDialog(null, "Libro agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Librería llena o posición inválida.");
        }
    }

    public Libro[] listarLibros() {
        return libros;
    }
}
