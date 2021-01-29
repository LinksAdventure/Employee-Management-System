package com.x5.domain;

import java.io.Serializable;
import java.util.PriorityQueue;

public class Employee implements Serializable {
    private Integer id;
    private String name;
    private Character gender;
    private String email;
    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", department=" + department +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Department getDepartment() {
        return department;
    }
}
