package com.mycompany.exercism;

public class ListaDuplamenteEncadiada {

    No inicio;
    No fim;
    int tamanho;

    public ListaDuplamenteEncadiada() {
        this.inicio = null;
        this.fim = null;
    }

    public void add(String nome) {
        No novoNo = new No(nome);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public void addPos(String nome, int pos) {
        No novoNo = new No(nome);
        
        if (pos == 0) {
           novoNo.proximo = inicio;
            if (inicio != null) {
                inicio.anterior = novoNo;
            }
            inicio = novoNo;
            tamanho++;
            return;
        }
        
        No atual = inicio;
        for (int i = 0; atual != null && i < pos - 1; i++) {
            atual = atual.proximo;
        }
        
        if (atual == null) {
            System.out.println("A posição é maior que o tamanho da lista.");
            return;
        }
        
        novoNo.proximo = atual.proximo;
        novoNo.anterior = atual;
        
        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        }

        atual.proximo = novoNo;
        tamanho++;
    }
    
    public void addFim(String nome){
        No novoNo = new No(nome);
        No atual = inicio;
        
        if (inicio == null) {
            inicio = novoNo;
            tamanho++;
            return;
        }
        
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        
        atual.proximo = novoNo;
        novoNo.anterior = atual;
        tamanho++;
    }

    public void print() {
        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.proximo;
        }
    }
    
    public boolean busque(String nome){
        No atual = inicio;
        while(atual != null){
            if (atual.nome.equals(nome)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void remove(String nome) {
        No atual = inicio;
        while (atual != null) {
            if (atual.nome.equals(nome)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                atual = null;
                tamanho--;
                return;
            }
            atual = atual.proximo;
        }
    }
    
    public void removeFim(){
        No atual = inicio;
        if (inicio.proximo == null) {
            inicio = null;
            tamanho--;
            return;
        }
        
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = null;
        tamanho--;
    }
    
    public void removePos(int pos){
        No atual = inicio;
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (pos == 1) {
            inicio = inicio.proximo;
            if (inicio != null) {
                inicio.anterior = null;
            }
            tamanho--;
            return;
        }
        
        for (int i = 1; atual != null && i < pos; i++) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Posição inválida.");
            return;
        }

        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        }

        if (atual.anterior != null) { 
            atual.anterior.proximo = atual.proximo;
        }
        tamanho--;
    }

    public void esvaziar() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }
}
