package app;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import view.Vista;

public class Main {
    public static void main(String[] args) {
        FlatMTMaterialLighterIJTheme.setup();
        Vista vista = new Vista();
        vista.setVisible(true);
    }
}