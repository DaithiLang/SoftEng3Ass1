
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.Years;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Student {
    
    private String name;
    private LocalDate dateOfBirth;
    private String id;
    private List<Module> modules = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return Years.yearsBetween(dateOfBirth, new LocalDate()).getYears();
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate DateOfBirth) {
        this.dateOfBirth = DateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    } 
    
}
