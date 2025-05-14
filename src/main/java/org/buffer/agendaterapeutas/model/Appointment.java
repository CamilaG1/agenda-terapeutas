package org.buffer.agendaterapeutas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
    @Id
    private Long id;
}
