package model;

public class Ordenamiento {
    // Método para aplicar QuickSort por código
    public static void quickSortCode(Libro[] libros, int low, int high) {
        if (low < high) {
            // Encuentra el índice de partición
            int pi = partitionCode(libros, low, high);

            // Ordena las dos mitades recursivamente
            quickSortCode(libros, low, pi - 1);
            quickSortCode(libros, pi + 1, high);
        }
    }

    // Método para hacer la partición
    private static int partitionCode(Libro[] libros, int low, int high) {
        int pivot = libros[high].getCodigo(); // Usamos el último elemento como pivote
        int i = (low - 1);     // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (libros[j].getCodigo() <= pivot) {
                i++;

                // Intercambiamos arr[i] y arr[j]
                Libro temp = libros[i];
                libros[i] = libros[j];
                libros[j] = temp;
            }
        }

        // Intercambiamos arr[i+1] y arr[high] (el pivote)
        Libro temp = libros[i + 1];
        libros[i + 1] = libros[high];
        libros[high] = temp;

        return i + 1;
    }

    // Método para aplicar QuickSort por título
    public static void quickSortTittle(Libro[] libros, int low, int high) {
        if (low < high) {
            // Encuentra el índice de partición
            int pi = partitionTittle(libros, low, high);

            // Ordena las dos mitades recursivamente
            quickSortTittle(libros, low, pi - 1);
            quickSortTittle(libros, pi + 1, high);
        }
    }

    // Método para hacer la partición
    public static int partitionTittle(Libro[] libros, int low, int high) {
        String pivot = libros[high].getTitulo(); // Usamos el último elemento como pivote
        int i = (low - 1);     // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (libros[j].getTitulo().compareTo(pivot) <= 0) {
                i++;

                // Intercambiamos arr[i] y arr[j]
                Libro temp = libros[i];
                libros[i] = libros[j];
                libros[j] = temp;
            }
        }

        // Intercambiamos arr[i+1] y arr[high] (el pivote)
        Libro temp = libros[i + 1];
        libros[i + 1] = libros[high];
        libros[high] = temp;

        return i + 1;
    }

    // Método para aplicar QuickSort por autor
    public static void quickSortAuthor(Libro[] libros, int low, int high) {
        if (low < high) {
            // Encuentra el índice de partición
            int pi = partitionAuthor(libros, low, high);
            // Ordena las dos mitades recursivamente
            quickSortAuthor(libros, low, pi - 1);
            quickSortAuthor(libros, pi + 1, high);
        }
    }

    // Método para hacer la partición
    public static int partitionAuthor(Libro[] libros, int low, int high) {
        String pivot = libros[high].getAutor(); // Usamos el último elemento como pivote
        int i = (low - 1);     // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (libros[j].getAutor().compareTo(pivot) <= 0) {
                i++;

                // Intercambiamos arr[i] y arr[j]
                Libro temp = libros[i];
                libros[i] = libros[j];
                libros[j] = temp;
            }
        }

        // Intercambiamos arr[i+1] y arr[high] (el pivote)
        Libro temp = libros[i + 1];
        libros[i + 1] = libros[high];
        libros[high] = temp;

        return i + 1;
    }

}
