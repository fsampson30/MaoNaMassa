package org.sampson.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionario() {
    }

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void populateDatabase() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Funcionario maria = new Funcionario("Maria",LocalDate.parse("18-10-2000", dateTimeFormatter),BigDecimal.valueOf(2009.44),"Operador");
        funcionarios.add(maria);
        Funcionario joao = new Funcionario("João",LocalDate.parse("12-05-1990", dateTimeFormatter),BigDecimal.valueOf(2284.38),"Operador");
        funcionarios.add(joao);
        Funcionario caio = new Funcionario("Caio",LocalDate.parse("02-05-1961", dateTimeFormatter),BigDecimal.valueOf(9836.14),"Coordenador");
        funcionarios.add(caio);
        Funcionario miguel = new Funcionario("João",LocalDate.parse("12-05-1990", dateTimeFormatter),BigDecimal.valueOf(2284.38),"Operador");
        funcionarios.add(joao);
    }

    public void listAll() {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).getNome() + " - " +
                    funcionarios.get(i).getDataNascimento() + " - " +
                    funcionarios.get(i).getSalario() + " - " +
                    funcionarios.get(i).getFuncao());
        }
    }


}
