package com.mycompany.projetorpged;

import com.mycompany.projetorpged.view.Principal.TelaPrincipal;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        });
    }
}
