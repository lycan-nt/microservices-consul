package com.owl.userservice.models;

public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer deptId;

    public User() {};

    public User(Integer id, String firstName, String lastName, Integer deptId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

}
