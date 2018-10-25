package com.mycompany.softeng3assignment1;


import com.mycompany.softeng3assignment1.Student;
import com.mycompany.softeng3assignment1.Course;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Module {
    
    private String name;
    private String id;
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourses(Course courses){
        this.courses.addAll(Arrays.asList(courses));
    }
    
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void addStudents(Student students){
        this.students.addAll(Arrays.asList(students));
    }
    
    
}
