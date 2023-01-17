package org.sampson.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa{

    private BigDecimal salario;
    private String funcao;

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

    public void populateDatabase(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario cadastro = new Funcionario();
        cadastro.setNome("Maria");
        cadastro.setDataNascimento(LocalDate.parse("18/10/2000"));
    }
}
