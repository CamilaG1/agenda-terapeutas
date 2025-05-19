package org.buffer.agendaterapeutas.controller;

import org.buffer.agendaterapeutas.model.Session;
import org.buffer.agendaterapeutas.service.ISessionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/session")
public class SessionController {

    private final ISessionService sessionService;

    //constructor
    public SessionController(ISessionService sessionService) {
        this.sessionService = sessionService;

    }
    @PostMapping
    public Session createSession(Session session) throws Exception {
        return sessionService.createSession(session);
    }
}
