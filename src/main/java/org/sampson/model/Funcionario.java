package org.sampson.model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

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
        Funcionario maria = new Funcionario("Maria", LocalDate.parse("18-10-2000", dateTimeFormatter), BigDecimal.valueOf(2009.44), "Operador");
        funcionarios.add(maria);
        Funcionario joao = new Funcionario("João", LocalDate.parse("12-05-1990", dateTimeFormatter), BigDecimal.valueOf(2284.38), "Operador");
        funcionarios.add(joao);
        Funcionario caio = new Funcionario("Caio", LocalDate.parse("02-05-1961", dateTimeFormatter), BigDecimal.valueOf(9836.14), "Coordenador");
        funcionarios.add(caio);
        Funcionario miguel = new Funcionario("Miguel", LocalDate.parse("14-10-1988", dateTimeFormatter), BigDecimal.valueOf(19119.88), "Diretor");
        funcionarios.add(miguel);
        Funcionario alice = new Funcionario("Alice", LocalDate.parse("05-01-1995", dateTimeFormatter), BigDecimal.valueOf(2234.68), "Recepcionista");
        funcionarios.add(alice);
        Funcionario heitor = new Funcionario("Heitor", LocalDate.parse("19-11-1999", dateTimeFormatter), BigDecimal.valueOf(1582.72), "Operador");
        funcionarios.add(heitor);
        Funcionario arthur = new Funcionario("Arthur", LocalDate.parse("31-03-1993", dateTimeFormatter), BigDecimal.valueOf(4071.84), "Contador");
        funcionarios.add(arthur);
        Funcionario laura = new Funcionario("Laura", LocalDate.parse("07-07-1994", dateTimeFormatter), BigDecimal.valueOf(3017.45), "Gerente");
        funcionarios.add(laura);
        Funcionario heloisa = new Funcionario("Heloisa", LocalDate.parse("24-05-2003", dateTimeFormatter), BigDecimal.valueOf(1606.85), "Eletricista");
        funcionarios.add(heloisa);
        Funcionario helena = new Funcionario("Helena", LocalDate.parse("02-09-1996", dateTimeFormatter), BigDecimal.valueOf(2799.93), "Gerente");
        funcionarios.add(helena);
    }

    public void listAll() {
        System.out.println(new ArrayList<>(funcionarios));
    }

    public void removePersonByName(String name) {
        Funcionario removed = funcionarios.stream().filter(funcionario -> funcionario.getNome().equals(name)).findFirst().orElseThrow(() ->
                new RuntimeException("Funcionário não encontrado"));
        funcionarios.remove(removed);
    }

    public void setRaise() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.setSalario(funcionario.getSalario().multiply(BigDecimal.valueOf(1.1)));
        }
        listAll();
    }

    public void mapEmployees() {
        System.out.println(funcionarios.stream().map(funcionario -> funcionario.getFuncao()).collect(Collectors.toList()));
    }

    public void showBirthdayList() {
       ArrayList<Funcionario> birthdayList = new ArrayList<>();
        for (Funcionario funcionario: funcionarios) {
            if (funcionario.getDataNascimento().getMonthValue() == 05 ||
                    funcionario.getDataNascimento().getMonthValue() == 12) {
                birthdayList.add(funcionario);
            }
       }
        System.out.println("Aniversariantes: " + "'\n'" +  birthdayList);
    }

    @Override
    public String toString() {
        return "Funcionário { " +
                "Nome: " + super.getNome() + " - " +
                "Data de Nascimento: " + super.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " +
                "salário: " + NumberFormat.getCurrencyInstance().format(salario) + " - " +
                "função: " + funcao + "}" + '\n';
    }
}
