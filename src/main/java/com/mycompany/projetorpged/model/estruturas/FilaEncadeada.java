package com.mycompany.projetorpged.model.estruturas;

public class FilaEncadeada<T> {
    private No<T> inicio, fim;
    private int tamanho;
    
    private static class No<T> {
        T dado;
        No<T> proximo;
    }
    
    public void enqueue(T elemento) {
        // Implementar
    }
    
    public T dequeue() {
        // Implementar
    }
    
    public boolean estaVazia() {
        // Implementar
    }
}
