package com.owl.userservice.models;

import java.util.List;

public class Depatament {

    private Integer id;
    private String name;
    private List<User> users;

    public Depatament() {};

    public Depatament(Integer id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

}
