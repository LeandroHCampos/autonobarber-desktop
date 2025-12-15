package org.example.autonobarberdesktop.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    private LocalDate dia;
    private LocalTime hora;
    private String status;
    private String servico;   // nome do serviço
    private String cliente;   // telefone do cliente
    private String barbeiro;  // email do barbeiro

    public Agendamento(LocalDate dia, LocalTime hora, String status, String servico, String cliente, String barbeiro) {
        this.dia = dia;
        this.hora = hora;
        this.status = status;
        this.servico = servico;
        this.cliente = cliente;
        this.barbeiro = barbeiro;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(String barbeiro) {
        this.barbeiro = barbeiro;
    }
}