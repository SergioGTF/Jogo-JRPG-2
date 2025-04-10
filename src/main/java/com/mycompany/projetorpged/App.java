package com.mycompany.projetorpged;

import com.mycompany.projetorpged.controller.ArenaController;
import com.mycompany.projetorpged.controller.JogadorController;
import com.mycompany.projetorpged.view.cad_login.TelaLoginJogador;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        JogadorController jogadorController = new JogadorController();
        ArenaController arenaController = new ArenaController();
    
    SwingUtilities.invokeLater(() -> {
        TelaLoginJogador telaLogin = new TelaLoginJogador(jogadorController);
        telaLogin.setVisible(true);
    });
}
}
