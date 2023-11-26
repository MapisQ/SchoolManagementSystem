package org.adaschool;

import org.adaschool.entity.Course;
import org.adaschool.entity.Student;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
        AcademicM academicM = new AcademicM();

        Course course = new Course(1,"sociales","Curso de geografia e historia",20,1);
        Course course1 = new Course(2,"ciencias","Curso de genetica",40,3);
        academicM.addCourse(course);
        //academicM.addCourse(course1);

        Student student = new Student(1,"Maria","Quito","20/04/2023","matriculado");
        Student student1 = new Student(2,"Angelica","Higuera","12/08/1993","Graduado");
        academicM.enrolledStudent(student);
        academicM.enrolledStudent(student1);

        academicM.enrolledCourseStudent(1,student);
        academicM.enrolledCourseStudent(2,student1);
        academicM.enrolledCourseStudent(1,student1);
        academicM.printAll();


        academicM.unenrolledCourseStudent(1,2);
        academicM.printAll();

    }
}
