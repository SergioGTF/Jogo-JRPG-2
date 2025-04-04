package com.mycompany.projetorpged.controller;

import com.mycompany.projetorpged.model.entidades.Jogador;
import java.util.ArrayList;
import java.util.List;

public class JogadorController {
    private List<Jogador> jogadores;
    
    public JogadorController() {
        this.jogadores = new ArrayList<>();
        
    }
    
    public boolean cadastrarJogador(String nome, String email, String senha) {
        for (Jogador j : jogadores) {
            if (j.getNome().equalsIgnoreCase(nome)) {
                return false;
            }
        }
        
        Jogador novoJogador = new Jogador(nome, email, senha);
        jogadores.add(novoJogador);
        return true;
    }
    
    public Jogador autenticar(String nome, String senha) {
        for (Jogador j : jogadores) {
            if (j.getNome().equalsIgnoreCase(nome)) {
                return j;
            }
        }
        return null;
    }
}