package org.buffer.agendaterapeutas.controller;

import org.buffer.agendaterapeutas.model.Sesion;
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
    public Sesion createSesion(Sesion sesion) throws Exception {
        return sesionService.createSesion(sesion);
    }
}
