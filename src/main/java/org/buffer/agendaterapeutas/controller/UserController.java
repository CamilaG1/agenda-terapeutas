package org.buffer.agendaterapeutas.controller;

import org.buffer.agendaterapeutas.model.User;
import org.buffer.agendaterapeutas.service.IUserService;
import org.buffer.agendaterapeutas.vo.UserVO;
import org.springframework.web.bind.annotation.*;

@RestController("/api/v1/user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) throws Exception {
        return userService.createUser(user);
    }

    @PutMapping
    public User updateUser(User user) throws Exception {
        throw new Exception();
    }

    @DeleteMapping
    public void deleteUser(User user) throws Exception {}

    @GetMapping("/{userId}")  //api/v1/user/358
    public UserVO getUserById(@PathVariable Long userId) throws Exception {
       return new UserVO(userService.getUserById(userId));
    }
}
