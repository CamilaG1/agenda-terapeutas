package org.buffer.agendaterapeutas.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSesion;

    @ManyToOne
    @JoinColumn(name = "id_terapeuta")
    private User terapeuta;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private User paciente;

    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;

    @Enumerated(EnumType.STRING)
    private EstadoSesion estado;

    // Constructors
    public Sesion() {}

    // Getters y Setters
    public String getIdSesion() {
        return String.valueOf(idSesion);
    }

    public void setIdSesion(Long idSesion) {
        this.idSesion = idSesion;
    }

    public User getTerapeuta() {
        return terapeuta;
    }

    public void setTerapeuta(User terapeuta) {
        this.terapeuta = terapeuta;
    }

    public User getPaciente() {
        return paciente;
    }

    public void setPaciente(User paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public EstadoSesion getEstado() {
        return estado;
    }

    public void setEstado(EstadoSesion estado) {
        this.estado = estado;
    }
}
