package model;

public class Busqueda {
    public static int iteracionesSecuencial = 0; // Contador de iteraciones para búsqueda secuencial
    public static int iteracionesBinaria = 0; // Contador de iteraciones para búsqueda binaria
    public static int[]  inicioV = new int[100]; // Arreglo para almacenar los valores de inicio en cada iteración
    public static int[]  medioV = new int[100]; // Arreglo para almacenar los valores de medio en cada iteración
    public static int[]  finV = new int[100]; // Arreglo para almacenar los valores de fin en cada iteración
    public static int[]  iteracionBi = new int[100]; // Arreglo para almacenar el número de iteración
    public static String[] valor = new String[100]; // Arreglo para almacenar los valores comparados en cada iteración
    public static int[] iteracionSec = new int[100]; // Arreglo para almacenar el número de iteración en búsqueda secuencial

    // Método de búsqueda secuencial para encontrar un libro por su código
    public static int busquedaSecuencialCodigo(Libro[] libros, int codigo) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            iteracionesSecuencial ++;
            iteracionSec[i] = i;
            valor[i] = String.valueOf(libros[i].getCodigo());
            if (libros[i] != null && libros[i].getCodigo() == codigo) {
                System.out.println("Encontrado en la posición: " + i);
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda secuencial para encontrar un libro por su título
    public static int busquedaSecuencialTitulo(Libro[] libros, String titulo) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            iteracionesSecuencial++;
            iteracionSec[i] = i;
            valor[i] = libros[i].getTitulo();
            if (libros[i] != null && libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Encontrado en la posición: " + i);
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda secuencial para encontrar un libro por su autor
    public static int busquedaSecuencialAutor(Libro[] libros, String autor) {
        int n = libros.length;
        for (int i = 0; i < n; i++) {
            iteracionesSecuencial++;
            iteracionSec[i] = i;
            valor[i] = libros[i].getAutor();
            if (libros[i] != null && libros[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println("Encontrado en la posición: " + i);
                return i; // Retorna la posición si se encuentra el libro
            }
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda binaria para encontrar un libro por su código
    public static int busquedaBinariaCodigo(Libro[] libros, int codigo) {
        iteracionesBinaria = 0;
        int n = libros.length;
        int inicio = 0;
        int medio;
        int fin = n - 1;
        int c = 0;
        while(inicio <= fin) {
            iteracionesBinaria++;
            inicioV[c] = inicio;
            finV[c] = fin;
            iteracionBi[c] = iteracionesBinaria;
            medio = (inicio + fin) / 2;
            medioV[c] = medio;
            if(libros[medio] != null) {
                if(libros[medio].getCodigo() == codigo) {
                    System.out.println("Encontrado en la posición: " + medio);
                    return medio; // Retorna la posición si se encuentra el libro
                } else if(libros[medio].getCodigo() < codigo) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                break; // Si el libro en la posición media es null, salir del bucle
            }
            c++;
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda binaria para encontrar un libro por su título
    public static int busquedaBinariaTitulo(Libro[] libros, String titulo) {
        iteracionesBinaria = 0;
        int n = libros.length;
        int inicio = 0;
        int medio;
        int fin = n - 1;
        int c = 0;
        while(inicio <= fin) {
            iteracionesBinaria++;
            inicioV[c] = inicio;
            finV[c] = fin;
            iteracionBi[c] = iteracionesBinaria;
            medio = (inicio + fin) / 2;
            if(libros[medio] != null) {
                int comparacion = libros[medio].getTitulo().compareToIgnoreCase(titulo);
                if(comparacion == 0) {
                    System.out.println("Encontrado en la posición: " + medio);
                    return medio; // Retorna la posición si se encuentra el libro
                } else if(comparacion < 0) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                break; // Si el libro en la posición media es null, salir del bucle
            }
            c++;
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    // Método de búsqueda binaria para encontrar un libro por su autor
    public static int busquedaBinariaAutor(Libro[] libros, String autor) {
        iteracionesBinaria = 0;
        int n = libros.length;
        int inicio = 0;
        int medio;
        int fin = n - 1;
        int c = 0;
        while(inicio <= fin) {
            iteracionesBinaria++;
            inicioV[c] = inicio;
            finV[c] = fin;
            iteracionBi[c] = iteracionesBinaria;
            medio = (inicio + fin) / 2;
            if(libros[medio] != null) {
                int comparacion = libros[medio].getAutor().compareToIgnoreCase(autor);
                if(comparacion == 0) {
                    System.out.println("Encontrado en la posición: " + medio);
                    return medio; // Retorna la posición si se encuentra el libro
                } else if(comparacion < 0) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            } else {
                break; // Si el libro en la posición media es null, salir del bucle
            }
            c++;
        }
        return -1; // Retorna -1 si no se encuentra el libro
    }

    public static void limpiarArreglos() {
        for(int i = 0; i < 100; i++) {
            inicioV[i] = 0;
            medioV[i] = 0;
            finV[i] = 0;
            iteracionBi[i] = 0;
            valor[i] = null;
            iteracionSec[i] = 0;
        }
        iteracionesSecuencial = 0;
        iteracionesBinaria = 0;
    }
}
