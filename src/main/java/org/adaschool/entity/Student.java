package org.adaschool.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    //Atributos
    private int idStudent;
    private String name;
    private String lastName;
    private String birthdayDate;
    private String state;

    public Student(int idStudent, String name, String lastName, String birthdayDate, String state) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.state = state;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdayDate='" + birthdayDate + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
