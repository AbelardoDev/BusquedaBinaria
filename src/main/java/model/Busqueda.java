package model;

public class Busqueda {
    public static int iteracionesSecuencial = 0;
    public static int iteracionesBinaria = 0;

    // Método de búsqueda secuencial para encontrar un libro por su código
    public static int busquedaSecuencialCodigo(Libro[] libros, int codigo) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            if (libros[i] != null && libros[i].getCodigo() == codigo) {
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda secuencial para encontrar un libro por su título
    public static int busquedaSecuencialTitulo(Libro[] libros, String titulo) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            if (libros[i] != null && libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda secuencial para encontrar un libro por su autor
    public static int busquedaSecuencialAutor(Libro[] libros, String autor) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            if (libros[i] != null && libros[i].getAutor().equalsIgnoreCase(autor)) {
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    public static int busquedaBinariaCodigo(Libro[] libros, int codigo) {
        iteracionesBinaria = 0;
        int n = libros.length;
        int inicio = 0;
        int medio;
        int fin = n - 1;
        while(inicio <= fin) {
            iteracionesBinaria++;
            medio = (inicio + fin) / 2;
            if(libros[medio] != null) {
                if(libros[medio].getCodigo() == codigo) {
                    return medio; // Retorna la posición si se encuentra el libro
                } else if(libros[medio].getCodigo() < codigo) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                break; // Si el libro en la posición media es null, salir del bucle
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    public static int busquedaBinariaTitulo(Libro[] libros, String titulo) {
        iteracionesBinaria = 0;
        int n = libros.length;
        int inicio = 0;
        int medio;
        int fin = n - 1;
        while(inicio <= fin) {
            iteracionesBinaria++;
            medio = (inicio + fin) / 2;
            if(libros[medio] != null) {
                int comparacion = libros[medio].getTitulo().compareToIgnoreCase(titulo);
                if(comparacion == 0) {
                    return medio; // Retorna la posición si se encuentra el libro
                } else if(comparacion < 0) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                break; // Si el libro en la posición media es null, salir del bucle
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    public static int busquedaBinariaAutor(Libro[] libros, String autor) {
        iteracionesBinaria = 0;
        int n = libros.length;
        int inicio = 0;
        int medio;
        int fin = n - 1;
        while(inicio <= fin) {
            iteracionesBinaria++;
            medio = (inicio + fin) / 2;
            if(libros[medio] != null) {
                int comparacion = libros[medio].getAutor().compareToIgnoreCase(autor);
                if(comparacion == 0) {
                    return medio; // Retorna la posición si se encuentra el libro
                } else if(comparacion < 0) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                break; // Si el libro en la posición media es null, salir del bucle
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }
}
