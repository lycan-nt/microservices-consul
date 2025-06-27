package com.owl.userservice.controllers;

import com.owl.userservice.models.Depatament;
import com.owl.userservice.models.User;
import com.owl.userservice.services.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserDetailsById(@PathParam("userId") Integer userId){
        User user = userService.getUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/depatament/{deptId}")
    public ResponseEntity<Depatament> getUsersByDeptId(@PathParam("deptId") Integer deptId){
        Depatament depatament = userService.getUsersByDept(deptId);
        return new ResponseEntity<Depatament>(depatament, HttpStatus.OK);
    }

}
