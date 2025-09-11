package controller;

//Importamos nuestras clases
import model.Biblioteca;
import model.Libro;
import model.Ordenamiento;
import model.Busqueda;
import view.Vista;
import view.VectorCompleto;

import javax.swing.table.DefaultTableModel;
import java.awt.*;

//Declaramos atributos de nuestra clase Controlador como el tamaño del arreglo, la biblioteca, la vista y el vector completo
//además de los colores para la interfaz, los índices de color y las iteraciones para las búsquedas
public class Controlador {
    private int n;
    private Biblioteca biblioteca;
    private Vista vista;
    private VectorCompleto vc;
    private static int colorIndex;
    private static int eleccion;
    static int[] iteracionesSecuencial = {0,0,0};
    static int[] iteracionesBinaria = {0,0,0};
    Color[] colors = {
            new Color(0, 0, 255),    // Azul
            new Color(255, 0, 0),    // Rojo
            new Color(0, 255, 0),    // Verde
            new Color(255, 255, 0),  // Amarillo
            new Color(255, 165, 0),  // Naranja
            new Color(128, 0, 128),  // Púrpura
            new Color(0, 255, 255),  // Cian
            new Color(255, 192, 203),// Rosa
            new Color(165, 42, 42),  // Marrón
            new Color(255, 20, 147)  // Rosa fuerte
    };;

    public Controlador() {
        inicializar();
    }

    //Inicializamos la vista, la biblioteca y los eventos
    public void inicializar() {
        vista = new Vista();
        vista.setVisible(true);
        vc = new VectorCompleto();
        colorIndex = 0;
        eleccion = 0;
        crearBiblioteca();
        eventos();
        setColor();
        grupoBotones();
    }

    //Creamos la biblioteca y llenamos el arreglo con libros predefinidos
    public void crearBiblioteca(){
        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:"));
        biblioteca = new Biblioteca(n);
        Libro[] temp = instanciarLibros();
        for (int i = 0; i < n; i++) {
            biblioteca.addLibro(temp[i]);
        }
    }

    //Declaramos un arreglo de libros con 100 libros predefinidos
    public Libro[] instanciarLibros(){
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

    //Método para limpiar la interfaz gráfica
    public void limpiar(){
        vista.getTflAuthor().setText("");
        vista.getTflAuthor2().setText("");
        vista.getTflAuthor3().setText("");
        vista.getTflCode().setText("");
        vista.getTflCode2().setText("");
        vista.getTflCode3().setText("");
        vista.getTflTittle().setText("");
        vista.getTflTittle2().setText("");
        vista.getTflTittle3().setText("");
        vista.getjLabel1().setText("Iteraciones Búsqueda Lineal: ");
        vista.getjLabel2().setText("Iteraciones Búsqueda Binaria: ");
        limpiarTabla((DefaultTableModel) vista.getTblLineal().getModel());
        limpiarTabla((DefaultTableModel) vista.getTblBinary().getModel());
    }

    //Llamada a métodos que permiten interactuar con la interfaz gráfica a través de eventos
    public void eventos(){
        eventoBotonLimpiar();
        eventoBuscar();
        eventoResultado1();
        eventoResultado2();
        eventoResultado3();
        eventoColor();
        eventoVerVector();
    }

    //Método para asignar colores a los paneles cuando el mouse entra o sale de ellos
    public void setColorToPanel(javax.swing.JPanel panel, boolean color) {
        if (color)
            panel.setBackground(new java.awt.Color(0, 0, 0));
        else
            panel.setBackground(getColor());
    }

    //Le asigna el color actual a los paneles y etiquetas de la interfaz gráfica
    public void setColor(){
        vista.getPnlSearch().setBackground(colors[colorIndex]);
        vista.getPnlLimpiar().setBackground(colors[colorIndex]);
        vista.getPnlResult().setBackground(colors[colorIndex]);
        vista.getPnlResult2().setBackground(colors[colorIndex]);
        vista.getPnlResult3().setBackground(colors[colorIndex]);
        vista.getPnlColor().setBackground(colors[colorIndex]);
        vista.getPnlVerVector().setBackground(colors[colorIndex]);
        vista.getLblAuthor().setForeground(colors[colorIndex]);
        vista.getLblCode().setForeground(colors[colorIndex]);
        vista.getTittle().setForeground(colors[colorIndex]);
        vista.getLblTittle().setForeground(colors[colorIndex]);
        vista.getjLabel1().setForeground(colors[colorIndex]);
        vista.getjLabel2().setForeground(colors[colorIndex]);
        vista.getTflAuthor().setForeground(colors[colorIndex]);
        vista.getTflAuthor2().setForeground(colors[colorIndex]);
        vista.getTflAuthor3().setForeground(colors[colorIndex]);
        vista.getTflCode().setForeground(colors[colorIndex]);
        vista.getTflCode2().setForeground(colors[colorIndex]);
        vista.getTflCode3().setForeground(colors[colorIndex]);
        vista.getTflTittle().setForeground(colors[colorIndex]);
        vista.getTflTittle2().setForeground(colors[colorIndex]);
        vista.getTflTittle3().setForeground(colors[colorIndex]);
        if(colorIndex == colors.length - 1)
            colorIndex = 0;
        else
            colorIndex++;
    }

    //Obtiene el color actual
    public Color getColor(){
        if (colorIndex != 0)
            return colors[colorIndex-1];
        else
            return colors[colorIndex];
    }

    //Botón para limpiar los campos de texto
    public void eventoBotonLimpiar(){
        vista.getPnlLimpiar().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlLimpiar().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlLimpiar(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlLimpiar(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                limpiar();
            }
        });
    }

    //Botón para buscar libros según los criterios seleccionados
    public void eventoBuscar(){
        vista.getPnlSearch().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlSearch().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlSearch(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlSearch(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eleccion = 0;
                Busqueda.limpiarArreglos();
                buscar();
                setIteraciones(0);
            }
        });
    }

    //Permite ver los resultados del primer campo de texto
    public void eventoResultado1(){
        vista.getPnlResult().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlResult().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlResult(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlResult(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eleccion = 0;
                Busqueda.limpiarArreglos();
                buscar();
                setIteraciones(0);
            }
        });
    }

    // Permite ver los resultados del segundo campo de texto
    public void eventoResultado2(){
        vista.getPnlResult2().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlResult2().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlResult2(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlResult2(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eleccion = 1;
                Busqueda.limpiarArreglos();
                buscar();
                setIteraciones(1);
            }
        });
    }

    // Permite ver los resultados del tercer campo de texto
    public void eventoResultado3(){
        vista.getPnlResult3().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlResult3().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlResult3(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlResult3(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eleccion = 2;
                Busqueda.limpiarArreglos();
                buscar();
                setIteraciones(2);
            }
        });
    }

    // Permite que el panel de color cambie de color al hacer clic en él
    public void eventoColor(){
        vista.getPnlColor().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlColor().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlColor(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlColor(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setColor();
            }
        });
    }

    // Botón que permite ver el vector completo de libros en una tabla
    public void eventoVerVector(){
        vista.getPnlVerVector().setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vista.getPnlVerVector().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlVerVector(), true);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setColorToPanel(vista.getPnlVerVector(), false);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vc.setVisible(true);
                mostrarVector(biblioteca.listarLibros(), (DefaultTableModel) vc.getjTable1().getModel());
            }
        });
    }

    // Llena una tabla con los libros disponibles en la biblioteca
    public void mostrarVector(Libro[] libros, DefaultTableModel model) {
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

    // Gestiona los botones radio para seleccionar el criterio de búsqueda
    public void grupoBotones(){
        vista.getGrpButtons().add(vista.getRbtCode());
        vista.getGrpButtons().add(vista.getRbtTittle());
        vista.getGrpButtons().add(vista.getRbtAuthor());
    }

    // Ordena los libros según el criterio seleccionado
    public void ordenarLibros(){
        if(vista.getRbtCode().isSelected()){
            ordenarCode();
        } else if (vista.getRbtTittle().isSelected()) {
            ordenarTittle();
        } else if (vista.getRbtAuthor().isSelected()) {
            ordenarAuthor();
        }
    }

    // Ordena según el codigo
    public void ordenarCode(){
        Ordenamiento.quickSortCode(biblioteca.listarLibros(), 0, n - 1);
    }

    // Ordena según el título
    public void ordenarTittle(){
        Ordenamiento.quickSortTittle(biblioteca.listarLibros(), 0, n - 1);
    }

    // Ordena según el autor
    public void ordenarAuthor(){
        Ordenamiento.quickSortAuthor(biblioteca.listarLibros(), 0, n - 1);
    }

    // Busca linealmente segun el codigo
    public void buscarCodigoLineal(Libro[] libros){
        if(!vista.getTflCode().getText().isEmpty() && eleccion == 0){
            Busqueda.busquedaSecuencialCodigo(libros, Integer.parseInt(vista.getTflCode().getText()) );
            iteracionesSecuencial[0] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
        if(!vista.getTflCode2().getText().isEmpty() && eleccion == 1){
            Busqueda.busquedaSecuencialCodigo(libros, Integer.parseInt(vista.getTflCode2().getText()));
            iteracionesSecuencial[1] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
        if(!vista.getTflCode3().getText().isEmpty() && eleccion == 2){
            Busqueda.busquedaSecuencialCodigo(libros, Integer.parseInt(vista.getTflCode3().getText()));
            iteracionesSecuencial[2] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
    }

    // Busca linealmente segun el título
    public void buscarTituloLineal(Libro[] libros){
        if(!vista.getTflTittle().getText().isEmpty() && eleccion == 0){
            Busqueda.busquedaSecuencialTitulo(libros, vista.getTflTittle().getText());
            iteracionesSecuencial [0] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
        if(!vista.getTflTittle2().getText().isEmpty() && eleccion == 1){
            Busqueda.busquedaSecuencialTitulo(libros, vista.getTflTittle2().getText());
            iteracionesSecuencial [1] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
        if(!vista.getTflTittle3().getText().isEmpty() && eleccion == 2){
            Busqueda.busquedaSecuencialTitulo(libros, vista.getTflTittle3().getText());
            iteracionesSecuencial [2] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
    }

    // Busca linealmente segun el autor
    public void buscarAutorLineal(Libro[] libros){
        if(!vista.getTflAuthor().getText().isEmpty() && eleccion == 0){
            Busqueda.busquedaSecuencialAutor(libros, vista.getTflAuthor().getText());
            iteracionesSecuencial [0] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
        if(!vista.getTflAuthor2().getText().isEmpty() && eleccion == 1){
            Busqueda.busquedaSecuencialAutor(libros, vista.getTflAuthor2().getText());
            iteracionesSecuencial [1] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
        if(!vista.getTflAuthor3().getText().isEmpty() && eleccion == 2){
            Busqueda.busquedaSecuencialAutor(libros, vista.getTflAuthor3().getText());
            iteracionesSecuencial [2] = Busqueda.iteracionesSecuencial;
            Busqueda.iteracionesSecuencial = 0;
        }
    }

    // Busca binariamente segun el codigo
    public void buscarCodigoBinaria(Libro[] libros){
        if(!vista.getTflCode().getText().isEmpty() && eleccion == 0){
            Busqueda.busquedaBinariaCodigo(libros, Integer.parseInt(vista.getTflCode().getText()) );
            iteracionesBinaria[0] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
        if(!vista.getTflCode2().getText().isEmpty() && eleccion == 1){
            Busqueda.busquedaBinariaCodigo(libros, Integer.parseInt(vista.getTflCode2().getText()));
            iteracionesBinaria[1] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
        if(!vista.getTflCode3().getText().isEmpty() && eleccion == 2){
            Busqueda.busquedaBinariaCodigo(libros, Integer.parseInt(vista.getTflCode3().getText()));
            iteracionesBinaria[2] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
    }

    // Busca binariamente segun el título
    public  void buscarTituloBinaria(Libro[] libros){
        if(!vista.getTflTittle().getText().isEmpty() && eleccion == 0){
            Busqueda.busquedaBinariaTitulo(libros, vista.getTflTittle().getText());
            iteracionesBinaria[0] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
        if(!vista.getTflTittle2().getText().isEmpty() && eleccion == 1){
            Busqueda.busquedaBinariaTitulo(libros, vista.getTflTittle2().getText());
            iteracionesBinaria[1] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
        if(!vista.getTflTittle3().getText().isEmpty() && eleccion == 2){
            Busqueda.busquedaBinariaTitulo(libros, vista.getTflTittle3().getText());
            iteracionesBinaria[2] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
    }

    // Busca binariamente segun el autor
    public void buscarAutorBinaria(Libro[] libros){
        if(!vista.getTflAuthor().getText().isEmpty() && eleccion == 0){
            Busqueda.busquedaBinariaAutor(libros, vista.getTflAuthor().getText());
            iteracionesBinaria[0] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
        if(!vista.getTflAuthor2().getText().isEmpty() && eleccion == 1){
            Busqueda.busquedaBinariaAutor(libros, vista.getTflAuthor2().getText());
            iteracionesBinaria[1] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
        if(!vista.getTflAuthor3().getText().isEmpty() && eleccion == 2){
            Busqueda.busquedaBinariaAutor(libros, vista.getTflAuthor3().getText());
            iteracionesBinaria[2] = Busqueda.iteracionesBinaria;
            Busqueda.iteracionesBinaria = 0;
        }
    }

    // Método principal que gestiona la búsqueda y ordenamiento según el criterio seleccionado
    public void buscar(){
        ordenarLibros();
        if(vista.getRbtCode().isSelected()){
            buscarCodigoLineal(biblioteca.listarLibros());
            buscarCodigoBinaria(biblioteca.listarLibros());
        } else if (vista.getRbtTittle().isSelected()) {
            buscarTituloLineal(biblioteca.listarLibros());
            buscarTituloBinaria(biblioteca.listarLibros());
        } else if (vista.getRbtAuthor().isSelected()) {
            buscarAutorLineal(biblioteca.listarLibros());
            buscarAutorBinaria(biblioteca.listarLibros());
        }
    }

    // Actualiza las etiquetas y tablas con las iteraciones y resultados de las búsquedas
    public void setIteraciones(int i){
        vista.getjLabel1().setText("Iteraciones Búsqueda Binaria: " + iteracionesBinaria[i]);
        vista.getjLabel2().setText("Iteraciones Búsqueda Lineal: " + iteracionesSecuencial[i]);
        tablaSecuencial((DefaultTableModel) vista.getTblBinary().getModel());
        tablaBinaria((DefaultTableModel) vista.getTblLineal().getModel());
    }

    // Llena las tablas con los detalles de las búsquedas secuenciales
    public void tablaSecuencial(DefaultTableModel model){
        model.setRowCount(0);
        String[] filas = new String[2];
        for(int i = 0; i < n; i++) {
            filas[0] = "" + (i + 1);
            filas[1] = Busqueda.valor[i];
            model.addRow(filas);
        }
    }

    // Llena las tablas con los detalles de las búsquedas binarias
    public void tablaBinaria(DefaultTableModel model){
        model.setRowCount(0);
        String[] filas = new String[4];
        int i = 0;
        while (Busqueda.iteracionBi[i] != 0) {
            filas[0] = "" + (i + 1);
            filas[1] = "" + Busqueda.inicioV[i];
            filas[2] = "" + Busqueda.medioV[i];
            filas[3] = "" + Busqueda.finV[i];
            model.addRow(filas);
            i++;
        }
    }

    public void limpiarTabla(DefaultTableModel model){
        model.setRowCount(0);
    }
}
