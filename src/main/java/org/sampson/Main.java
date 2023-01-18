package org.sampson;

import org.sampson.model.Funcionario;
import org.sampson.service.FuncionarioServiceImpl;

public class Main {
    public static void main(String[] args) {

        FuncionarioServiceImpl funcionario = new FuncionarioServiceImpl();

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

        funcionario.listAllAlphabetically();

        funcionario.showSummedSalaries();

        funcionario.listAmountOfSalariesPerPerson();


    }
}