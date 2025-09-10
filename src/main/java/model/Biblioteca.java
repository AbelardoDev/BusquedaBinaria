package model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Biblioteca {
    private Libro[] libros;
    private int posicion;
    private int posicionesVacias;
    public Biblioteca(int n) {
        libros = new Libro[n];
        posicion = 0;
        posicionesVacias = 0;
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

    public void revisarPosicionesVacias() {
        posicionesVacias = 0;
        for (Libro libro : libros) {
            if (libro == null)
                posicionesVacias++;
        }
    }

    public static void exchange(Libro[] arreglo, int a, int b) {
        Libro temp = arreglo[a];
        arreglo[a] = arreglo[b];
        arreglo[b] = temp;
    }

    public Libro[] bubbleSort(boolean ascending) {
        revisarPosicionesVacias();
        int n = listarLibros().length - posicionesVacias;
        Libro[] temp = listarLibros().clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascending) {
                    if (temp[j].getCodigo() > temp[j + 1].getCodigo())
                        exchange(temp, j, j + 1);
                } else {
                    if (temp[j].getnPaginas() < temp[j + 1].getnPaginas())
                        exchange(temp, j, j + 1);
                }
            }
        }
        return temp;
    }

    public Libro[] sortDescending() {
        return bubbleSort(false);
    }

    public Libro[] sortAscending() {
        return bubbleSort(true);
    }

    public void llenarTabla(Libro[] libros, DefaultTableModel model) {
        model.setRowCount(0);
        String[] filas = new String[4];
        for(Libro libro : libros) {
            if(libro != null) {
                filas[0] = String.valueOf(libro.getCodigo());
                filas[1] = libro.getTitulo();
                filas[2] = libro.getAutor();
                filas[3] = String.valueOf(libro.getnPaginas());
                model.addRow(filas);
            }
        }
    }

    public void cleanTable(DefaultTableModel model) {
        model.setRowCount(0);
    }

    public void deleteBooks() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null)
                libros[i] = null;
        }
        posicion = 0;
        posicionesVacias = 0;
    }
}
