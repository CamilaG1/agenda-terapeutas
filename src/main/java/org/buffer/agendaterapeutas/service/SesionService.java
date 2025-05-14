package org.buffer.agendaterapeutas.service;

import org.buffer.agendaterapeutas.model.Session;
import org.buffer.agendaterapeutas.repository.SesionRepository;
import org.springframework.stereotype.Service;

@Service
public class SesionService implements ISesionService {

    private final SesionRepository sesionRepository;

    public SesionService(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }

    @Override
    public Session createSesion(Session session) throws Exception {
        if(sesionRepository.existsByIdSesion(session.getIdSession())){
            throw new Exception("La sesion ya existe");
        }
        return sesionRepository.save(session);
    }
}
