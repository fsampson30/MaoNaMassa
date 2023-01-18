package org.sampson;

import org.sampson.service.FuncionarioServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FuncionarioServiceImpl funcionario = new FuncionarioServiceImpl();
        Scanner command = new Scanner(System.in);

        funcionario.populateDatabase();
        System.out.println("Banco de dados criado, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.listAll();
        System.out.println("Listagem dos funcionários, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.removePersonByName("João");
        System.out.println("Funcionário João removido, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.setRaise();
        System.out.println("Salários aumentados em 10%, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.mapEmployees();
        System.out.println("Funcionários mapeados por Função, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.showBirthdayList();
        System.out.println("Lista de funcionários aniversariantes nos meses 10 e 12, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.showOldestEmployee();
        System.out.println("Funcionário com maior idade, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.listAllAlphabetically();
        System.out.println("Funcionário listados alfabeticamente, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.showSummedSalaries();
        System.out.println("Somatório dos salários, digite 1 e pressione ENTER para continuar");
        command.next();

        funcionario.listAmountOfSalariesPerPerson();
        System.out.println("Quantidade de salários mínimos por funcionário, digite 1 e pressione ENTER para continuar");
        command.next();


    }
}