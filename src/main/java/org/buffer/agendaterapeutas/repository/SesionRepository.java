package org.buffer.agendaterapeutas.repository;

import org.buffer.agendaterapeutas.model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long>{
    boolean existsByIdSesion(String sesionId);
}
