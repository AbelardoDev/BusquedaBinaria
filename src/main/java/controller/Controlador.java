package controller;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import model.Biblioteca;
import view.Vista;

public class Controlador {
    int n;
    public Controlador() {
        inicializar();
    }

    public void inicializar(){
        FlatMTMaterialLighterIJTheme.setup();
        Vista vista = new Vista();
        vista.setVisible(true);
        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el tamaño del arreglo:"));
        Biblioteca biblioteca = new Biblioteca(n);
    }
}
