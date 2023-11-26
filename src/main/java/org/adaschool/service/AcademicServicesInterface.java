package org.adaschool.service;

import org.adaschool.entity.Course;
import org.adaschool.entity.Student;

public interface AcademicServicesInterface {

    public void enrolledStudent(Student student);
    public void addCourse(Course course);
    public void enrolledCourseStudent(int idCourse,Student student);
    public void unenrolledCourseStudent(int idCourse, int idstudent);
}
