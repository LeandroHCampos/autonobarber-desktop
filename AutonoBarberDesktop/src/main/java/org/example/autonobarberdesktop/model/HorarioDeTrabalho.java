package org.example.autonobarberdesktop.model;

import java.time.LocalTime;

public class HorarioDeTrabalho {
    private Integer diaDaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private String barbeiro;

    public HorarioDeTrabalho(Integer diaDaSemana, LocalTime horaInicio, LocalTime horaFim, String barbeiro) {
        this.diaDaSemana = diaDaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.barbeiro = barbeiro;
    }

    public Integer getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(Integer diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public String getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(String barbeiro) {
        this.barbeiro = barbeiro;
    }
}

