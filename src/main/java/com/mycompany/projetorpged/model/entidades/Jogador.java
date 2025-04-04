package com.mycompany.projetorpged.model.entidades;

public class Jogador {
    private String nome;
    private String email;
    private String senha;
    
    public Jogador(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
}