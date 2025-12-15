package org.example.autonobarberdesktop.model;

import java.math.BigDecimal;

public class Servicos {

    private String nome;
    private Integer duracaoMinutos;
    private BigDecimal preco;
    private String barbeiro; // email do barbeiro

    public Servicos(String nome, Integer duracaoMinutos, BigDecimal preco, String barbeiro) {
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos;
        this.preco = preco;
        this.barbeiro = barbeiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(String barbeiro) {
        this.barbeiro = barbeiro;
    }
}
