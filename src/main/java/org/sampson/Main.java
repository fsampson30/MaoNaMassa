package org.sampson;

import org.sampson.model.Funcionario;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Funcionario funcionario = new Funcionario();

        funcionario.populateDatabase();
        funcionario.listAll();
    }
}