package com.mycompany.projetorpged.model.entidades;

import com.mycompany.projetorpged.model.estruturas.ListaEncadeada;


public abstract class Personagem {
    protected int id;
    protected String nome;
    protected int nivel;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int manaMaxima;
    protected int manaAtual;
    protected ListaEncadeada<Habilidade> habilidades;
    
    public abstract void atacar(Personagem alvo);
    public boolean estaVivo() {
        return vidaAtual > 0;
    }
}
