package model;

public class Busqueda {
    // Método de búsqueda secuencial para encontrar un libro por su código
    public int busquedaSecuencial(Libro[] libros, int codigo) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            if (libros[i] != null && libros[i].getCodigo() == codigo) {
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }
}
