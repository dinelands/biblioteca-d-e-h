package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo a biblioteca!");

        int numero = 210;
        ArrayList<Autor> autores = new ArrayList();
        autores.add(new Autor("valter"));
        autores.add(new Autor("tomas"));
        Autor autor =  new Autor("Autor anonimo ex"); //Autor (String nome)

        //abaixo construtor
        Livro livro1 = new Livro("titulo do livro", autores); //Livro (String titulo, Autor autor) | colocar os que ele pediu com helena!


        System.out.println("Autor: " + livro1.getAutor().get(0).getNome()); //aparecer la embaixo
        System.out.println("Titulo: " + livro1.getTitulo());
    }
}
