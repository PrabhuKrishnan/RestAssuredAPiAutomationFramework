package com.app.utils.fixtures;

import java.util.List;


public class Employee {


    private int id;
    private boolean isFTE;
    private String firstName;
    private Address address;
    private List<String> roles;


    public Employee(int id, boolean isFTE, String firstName, Address address, List<String> roles) {
        this.id = id;
        this.isFTE = isFTE;
        this.firstName = firstName;
        this.address = address;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public boolean isFTE() {
        return isFTE;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", isFTE=" + isFTE +
                ", firstName='" + firstName + '\'' +
                ", address=" + address +
                ", roles=" + roles +
                '}';
    }
}
