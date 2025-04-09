package com.mycompany.projetorpged.model.estruturas;


public class PilhaEncadeada<T> {
    private No<T> topo;
    private int tamanho;
    
    private static class No<T> {
        T dado;
        No<T> proximo;
    }
    
    public void push(T elemento) {
        // Implementar
    }
    
    public T pop() {
        // Implementar
    }
}
