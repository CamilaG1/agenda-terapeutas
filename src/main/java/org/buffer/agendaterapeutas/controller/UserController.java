package org.buffer.agendaterapeutas.controller;

import org.buffer.agendaterapeutas.model.User;
import org.buffer.agendaterapeutas.repository.UserRepository;
import org.buffer.agendaterapeutas.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(User user) throws Exception {
        return userService.createUser(user);
    }
}
