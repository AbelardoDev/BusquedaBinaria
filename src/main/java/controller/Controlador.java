package controller;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import model.Biblioteca;
import model.Libro;
import view.Vista;

public class Controlador {
    int n;
    Biblioteca biblioteca;
    Vista vista;
    public Controlador() {
        inicializar();
    }

    public void inicializar(){
        FlatMTMaterialLighterIJTheme.setup();
        vista = new Vista();
        vista.setVisible(true);
        crearBiblioteca();
    }

    public void crearBiblioteca(){
        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:"));
        biblioteca = new Biblioteca(n);
        Libro[] temp = agregarLibros();
        for (int i = 0; i < n; i++) {
            biblioteca.addLibro(temp[i]);
        }
    }

    public Libro[] agregarLibros(){
        Libro[] libros = new Libro[] {
                new Libro("El Quijote", "Miguel de Cervantes", 1, 1605),
                new Libro("Cien Años de Soledad", "Gabriel García Márquez", 2, 1967),
                new Libro("La Odisea", "Homero", 3, -800),
                new Libro("La Iliada", "Homero", 4, -750),
                new Libro("Hamlet", "William Shakespeare", 5, 1603),
                new Libro("Romeo y Julieta", "William Shakespeare", 6, 1597),
                new Libro("Divina Comedia", "Dante Alighieri", 7, 1320),
                new Libro("Fausto", "Johann Wolfgang von Goethe", 8, 1808),
                new Libro("Crimen y Castigo", "Fiódor Dostoyevski", 9, 1866),
                new Libro("Los Hermanos Karamazov", "Fiódor Dostoyevski", 10, 1880),

                new Libro("Anna Karenina", "León Tolstói", 11, 1877),
                new Libro("Guerra y Paz", "León Tolstói", 12, 1869),
                new Libro("Madame Bovary", "Gustave Flaubert", 13, 1857),
                new Libro("Don Juan Tenorio", "José Zorrilla", 14, 1844),
                new Libro("Fortunata y Jacinta", "Benito Pérez Galdós", 15, 1887),
                new Libro("Marianela", "Benito Pérez Galdós", 16, 1878),
                new Libro("El Conde de Montecristo", "Alexandre Dumas", 17, 1844),
                new Libro("Los Tres Mosqueteros", "Alexandre Dumas", 18, 1844),
                new Libro("La Regenta", "Leopoldo Alas Clarín", 19, 1884),
                new Libro("Tirano Banderas", "Ramón María del Valle-Inclán", 20, 1926),

                new Libro("La Familia de Pascual Duarte", "Camilo José Cela", 21, 1942),
                new Libro("Rayuela", "Julio Cortázar", 22, 1963),
                new Libro("Pedro Páramo", "Juan Rulfo", 23, 1955),
                new Libro("El Llano en Llamas", "Juan Rulfo", 24, 1953),
                new Libro("La Vorágine", "José Eustasio Rivera", 25, 1924),
                new Libro("Doña Bárbara", "Rómulo Gallegos", 26, 1929),
                new Libro("Martín Fierro", "José Hernández", 27, 1872),
                new Libro("Bodas de Sangre", "Federico García Lorca", 28, 1933),
                new Libro("La Casa de Bernarda Alba", "Federico García Lorca", 29, 1936),
                new Libro("Yerma", "Federico García Lorca", 30, 1934),

                new Libro("1984", "George Orwell", 31, 1949),
                new Libro("Rebelión en la Granja", "George Orwell", 32, 1945),
                new Libro("Un Mundo Feliz", "Aldous Huxley", 33, 1932),
                new Libro("Fahrenheit 451", "Ray Bradbury", 34, 1953),
                new Libro("Dune", "Frank Herbert", 35, 1965),
                new Libro("Neuromante", "William Gibson", 36, 1984),
                new Libro("Fundación", "Isaac Asimov", 37, 1951),
                new Libro("Yo, Robot", "Isaac Asimov", 38, 1950),
                new Libro("Crónicas Marcianas", "Ray Bradbury", 39, 1950),
                new Libro("Solaris", "Stanisław Lem", 40, 1961),

                new Libro("Ensayo sobre la Ceguera", "José Saramago", 41, 1995),
                new Libro("El Evangelio según Jesucristo", "José Saramago", 42, 1991),
                new Libro("La Ciudad y los Perros", "Mario Vargas Llosa", 43, 1963),
                new Libro("Conversación en La Catedral", "Mario Vargas Llosa", 44, 1969),
                new Libro("La Fiesta del Chivo", "Mario Vargas Llosa", 45, 2000),
                new Libro("Pantaleón y las Visitadoras", "Mario Vargas Llosa", 46, 1973),
                new Libro("Los Detectives Salvajes", "Roberto Bolaño", 47, 1998),
                new Libro("2666", "Roberto Bolaño", 48, 2004),
                new Libro("La Tregua", "Mario Benedetti", 49, 1960),
                new Libro("Gracias por el Fuego", "Mario Benedetti", 50, 1965),

                new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 51, 1985),
                new Libro("Del Amor y Otros Demonios", "Gabriel García Márquez", 52, 1994),
                new Libro("Memoria de mis Putas Tristes", "Gabriel García Márquez", 53, 2004),
                new Libro("Vivir para Contarla", "Gabriel García Márquez", 54, 2002),
                new Libro("Relato de un Náufrago", "Gabriel García Márquez", 55, 1970),
                new Libro("El Coronel no tiene quien le escriba", "Gabriel García Márquez", 56, 1961),
                new Libro("La Hojarasca", "Gabriel García Márquez", 57, 1955),
                new Libro("Ojos de Perro Azul", "Gabriel García Márquez", 58, 1972),
                new Libro("Doña Perfecta", "Benito Pérez Galdós", 59, 1876),
                new Libro("Miau", "Benito Pérez Galdós", 60, 1888),

                new Libro("El Hobbit", "J.R.R. Tolkien", 61, 1937),
                new Libro("El Señor de los Anillos: La Comunidad del Anillo", "J.R.R. Tolkien", 62, 1954),
                new Libro("El Señor de los Anillos: Las Dos Torres", "J.R.R. Tolkien", 63, 1954),
                new Libro("El Señor de los Anillos: El Retorno del Rey", "J.R.R. Tolkien", 64, 1955),
                new Libro("Silmarillion", "J.R.R. Tolkien", 65, 1977),
                new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", 66, 1997),
                new Libro("Harry Potter y la Cámara Secreta", "J.K. Rowling", 67, 1998),
                new Libro("Harry Potter y el Prisionero de Azkaban", "J.K. Rowling", 68, 1999),
                new Libro("Harry Potter y el Cáliz de Fuego", "J.K. Rowling", 69, 2000),
                new Libro("Harry Potter y la Orden del Fénix", "J.K. Rowling", 70, 2003),

                new Libro("Harry Potter y el Misterio del Príncipe", "J.K. Rowling", 71, 2005),
                new Libro("Harry Potter y las Reliquias de la Muerte", "J.K. Rowling", 72, 2007),
                new Libro("El Alquimista", "Paulo Coelho", 73, 1988),
                new Libro("Verónika Decide Morir", "Paulo Coelho", 74, 1998),
                new Libro("Brida", "Paulo Coelho", 75, 1990),
                new Libro("Once Minutos", "Paulo Coelho", 76, 2003),
                new Libro("Manual del Guerrero de la Luz", "Paulo Coelho", 77, 1997),
                new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 78, 2001),
                new Libro("El Juego del Ángel", "Carlos Ruiz Zafón", 79, 2008),
                new Libro("El Prisionero del Cielo", "Carlos Ruiz Zafón", 80, 2011),

                new Libro("Marina", "Carlos Ruiz Zafón", 81, 1999),
                new Libro("El Laberinto de los Espíritus", "Carlos Ruiz Zafón", 82, 2016),
                new Libro("It", "Stephen King", 83, 1986),
                new Libro("El Resplandor", "Stephen King", 84, 1977),
                new Libro("Cementerio de Animales", "Stephen King", 85, 1983),
                new Libro("Carrie", "Stephen King", 86, 1974),
                new Libro("Misery", "Stephen King", 87, 1987),
                new Libro("Doctor Sueño", "Stephen King", 88, 2013),
                new Libro("Apocalipsis", "Stephen King", 89, 1978),
                new Libro("La Torre Oscura I: La Hierba del Diablo", "Stephen King", 90, 1982),

                new Libro("La Torre Oscura II: La Invocación", "Stephen King", 91, 1987),
                new Libro("La Torre Oscura III: Las Tierras Baldías", "Stephen King", 92, 1991),
                new Libro("La Torre Oscura IV: Mago y Cristal", "Stephen King", 93, 1997),
                new Libro("La Torre Oscura V: Lobos del Calla", "Stephen King", 94, 2003),
                new Libro("La Torre Oscura VI: Canción de Susannah", "Stephen King", 95, 2004),
                new Libro("La Torre Oscura VII: La Torre Oscura", "Stephen King", 96, 2004),
                new Libro("Bajo la Misma Estrella", "John Green", 97, 2012),
                new Libro("Ciudades de Papel", "John Green", 98, 2008),
                new Libro("Buscando a Alaska", "John Green", 99, 2005),
                new Libro("Turtles All the Way Down", "John Green", 100, 2017)
        };
        return libros;
    }
}
