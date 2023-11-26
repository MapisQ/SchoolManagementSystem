package org.adaschool.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int idCourse;
    private String nameCourse;
    private String description;
    private int credits;
    private int vertion;

    public Course(int idCourse, String nameCourse, String description, int credits, int vertion) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.description = description;
        this.credits = credits;
        this.vertion = vertion;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getVertion() {
        return vertion;
    }

    public void setVertion(int vertion) {
        this.vertion = vertion;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                ", description='" + description + '\'' +
                ", credits=" + credits +
                ", vertion=" + vertion +
                '}';
    }
}
