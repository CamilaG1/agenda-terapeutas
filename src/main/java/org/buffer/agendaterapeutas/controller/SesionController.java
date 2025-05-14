package org.buffer.agendaterapeutas.controller;

import org.buffer.agendaterapeutas.model.Session;
import org.buffer.agendaterapeutas.service.ISesionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/sesion")
public class SesionController {

    private final ISesionService sesionService;

    //constructor
    public SesionController(ISesionService sesionService) {
        this.sesionService = sesionService;

    }
    @PostMapping
    public Session createSesion(Session session) throws Exception {
        return sesionService.createSesion(session);
    }
}
