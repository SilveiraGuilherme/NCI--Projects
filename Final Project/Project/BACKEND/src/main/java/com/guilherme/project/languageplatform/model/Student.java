package com.guilherme.project.languageplatform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    // Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentID;
    private String firstName;
    private String lastName;

    // Constructors
    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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
}
