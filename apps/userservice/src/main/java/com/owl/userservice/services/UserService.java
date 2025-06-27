package com.owl.userservice.services;

import com.owl.userservice.models.Depatament;
import com.owl.userservice.models.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public User getUser(Integer id) {
        return new User(
                id,
                "Felipe",
                "D. Santos",
                1
        );
    }

    public Depatament getUsersByDept(Integer id) {
        List<User> users = getUsers();
        return new Depatament(
                id,
                "MS",
                users
        );
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User felipe = new User(
                1,
                "Felipe",
                "D. Santos",
                1
        );
        users.add(felipe);
        User hiago = new User(
                2,
                "Hiago",
                "Alves",
                1
        );
        users.add(hiago);
        return users;
    }

}
