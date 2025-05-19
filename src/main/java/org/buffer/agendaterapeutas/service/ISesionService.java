package org.buffer.agendaterapeutas.service;

import org.buffer.agendaterapeutas.model.Session;

public interface ISessionService {
    Session createSession(Session session) throws Exception;
}
