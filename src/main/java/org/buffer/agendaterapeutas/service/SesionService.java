package org.buffer.agendaterapeutas.service;

import org.buffer.agendaterapeutas.model.Sesion;
import org.buffer.agendaterapeutas.repository.SesionRepository;
import org.springframework.stereotype.Service;

@Service
public class SesionService implements ISesionService {

    private final SesionRepository sesionRepository;

    public SesionService(SesionRepository sesionRepository) {
        this.sesionRepository = sesionRepository;
    }

    @Override
    public Sesion createSesion(Sesion sesion) throws Exception {
        if(sesionRepository.existsByIdSesion(sesion.getIdSesion())){
            throw new Exception("La sesion ya existe");
        }
        return sesionRepository.save(sesion);
    }
}
