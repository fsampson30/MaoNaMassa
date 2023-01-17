package org.sampson;

import org.sampson.model.Funcionario;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.populateDatabase();
        funcionario.listAll();

        funcionario.removePersonByName("Miguel");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");


        funcionario.listAll();

        funcionario.setRaise();

        funcionario.mapEmployees();

        funcionario.showBirthdayList();

        funcionario.showOldestEmployee();


    }
}