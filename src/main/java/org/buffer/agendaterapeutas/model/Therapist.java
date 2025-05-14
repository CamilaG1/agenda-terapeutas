package org.buffer.agendaterapeutas.model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Therapist extends User {

    private Specialty specialty;
    private List<Appointment> appointments;

}
