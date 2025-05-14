package org.buffer.agendaterapeutas.service;

import org.buffer.agendaterapeutas.model.Session;

public interface ISesionService {
    Session createSesion(Session session) throws Exception;
}
