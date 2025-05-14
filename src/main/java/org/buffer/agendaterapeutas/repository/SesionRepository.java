package org.buffer.agendaterapeutas.repository;

import org.buffer.agendaterapeutas.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends JpaRepository<Session, Long>{
    boolean existsByIdSesion(String sesionId);
}
