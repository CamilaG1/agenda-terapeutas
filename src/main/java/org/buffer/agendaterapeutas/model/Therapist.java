package org.buffer.agendaterapeutas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Therapist extends User {

    private Specialty specialty;
    @OneToMany
    private List<Session> sessions;

}
