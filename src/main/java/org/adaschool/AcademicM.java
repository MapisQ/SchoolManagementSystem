package org.adaschool;

import org.adaschool.entity.Course;
import org.adaschool.entity.Student;
import org.adaschool.service.AcademicServicesInterface;

import java.util.*;

public class AcademicM implements AcademicServicesInterface {

    List<Course> coursesList = new ArrayList<>();
    List<Student> studentsList = new ArrayList<>();

    Map<Integer, List<Student>> studentsCoursesRelation = new HashMap<>();


    @Override
    public void enrolledStudent(Student student) {
        if (!studentsList.contains(student)) {
            studentsList.add(student);
            System.out.println("¡Estudiante Registrado con exito!");
        }else {
            System.out.println("El estudiante ya se encuentra registrado");
        }
    }

    @Override
    public void addCourse(Course course) {
        if (!coursesList.contains(course)) {
            coursesList.add(course);
            System.out.println("¡Curso Registrado con exito!");
        }else {
            System.out.println("El curso ya se encuentra registrado");
        }
    }

    @Override
    public void enrolledCourseStudent(int idCourse, Student student) {
        Optional<Course> optionalCourse = coursesList.stream()
                .filter(course ->course.getIdCourse() == idCourse).findFirst();
        if (!optionalCourse.isPresent()) {
            System.out.println("El curso no se encuentra registrado");
            return;
        }
        if (!studentsList.contains(student)) {
            System.out.println("El estudiane no se encuentra registrado");
            return;
        }

        List<Student> studentCourses = studentsCoursesRelation.get(student);
        if (studentCourses == null) {
            studentCourses = new ArrayList<>();
            studentCourses.add(student);
            studentsCoursesRelation.put(idCourse, studentCourses);
        }

        System.out.println("El estudiante " + student.getName()+
                " se ha inscrito en el curso de forma exitosa");
    }

    @Override
    public void unenrolledCourseStudent(int idCourse, int idStudent) {
        Optional<Course> optionalCourse = coursesList.stream()
                .filter(course ->course.getIdCourse() == idCourse).findFirst();
        if (!optionalCourse.isPresent()){
            System.out.println("no se encuentra registrado el curso");
        }
        Optional<Student> optionalStudent = studentsList.stream()
                .filter(student ->student.getIdStudent() == idStudent).findFirst();
        if (!optionalStudent.isPresent()){
            System.out.println("El estudiante no se encuentra registrado");
        }
        Student student = optionalStudent.get();

        List<Student> studentsInCourse =studentsCoursesRelation.get(idCourse);

        if (studentsInCourse != null && studentsInCourse.contains(student)) {
            studentsInCourse.remove(student);
            System.out.println("Estudiante eliminado");
        }
        if (studentsInCourse.contains(optionalCourse)){
            System.out.println("El id "+idCourse+" no se encuentra registrado");
        }
    }

    public void printAll(){
        System.out.println(studentsCoursesRelation);
    }
}
