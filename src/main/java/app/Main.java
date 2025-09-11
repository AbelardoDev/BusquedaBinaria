package app;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import controller.Controlador;

public class Main {
    public static void main(String[] args) {
        FlatMTMaterialLighterIJTheme.setup();
        // Inicia el controlador principal de la aplicación
        // debido a que el controlador maneja la vista y el modelo
        // y asimismo los inicializa.
        Controlador controlador = new Controlador();
    }
}