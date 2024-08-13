package com.mycompany.exercism;

public class Exercism {

    public static void main(String[] args) {
        ListaDuplamenteEncadiada lista = new ListaDuplamenteEncadiada();

        lista.add("Homer");
        lista.add("Marge");
        lista.print();
        
        lista.esvaziar();
        lista.print();
        
        lista.add("Homer");
        lista.addPos("Bart", 0);
        lista.addPos("Moll", 1);
        lista.print();
        
        lista.esvaziar();
        lista.print();
        
        lista.add("Homer");
        lista.add("Bart");     
        lista.addPos("lisa", 0);
        lista.print();
        System.out.println(lista.tamanho);
        lista.esvaziar();
        lista.print();
        
        lista.add("Homer");
        lista.add("Meggie");
        
        lista.addPos("Bart", 0);
        lista.addPos("Marge", 1);
        lista.print();
        
        System.out.println(lista.busque("Meggie"));
        
        lista.esvaziar();
        

        lista.add("Homer");
        lista.add("Bart");
        System.out.println(lista.tamanho);
        lista.print();
        
        System.out.println(lista.busque("Marge"));
        System.out.println(lista.busque("Homer"));
        System.out.println(lista.busque("Bart"));
        System.out.println(lista.busque("Maggie"));
        System.out.println(lista.tamanho);
        lista.esvaziar();

        lista.add("Homer");
        lista.add("Bart");
        lista.add("Marge");
        lista.addPos("Marggie", 1);
        lista.addPos("Ned-Flanders", 0);
        lista.addFim("Sr.Burns");

        lista.print();
        
        lista.removeFim();
        
        lista.print();

        lista.removePos(1);
        lista.print();
        System.out.println(lista.tamanho);

        System.out.println(lista.busque("Marge"));
        System.out.println(lista.busque("Homer"));
        System.out.println(lista.busque("Bart"));
        System.out.println(lista.busque("Maggie"));
        System.out.println(lista.tamanho);
        
        lista.removePos(0);
        System.out.println(lista.tamanho);
        
        lista.esvaziar();
        lista.print();

    }
}
