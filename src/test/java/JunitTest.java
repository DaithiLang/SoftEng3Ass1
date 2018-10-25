/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.softeng3assignment1.Student;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class JunitTest {
    
    @Test
    public void WhatIsUsername(){
        Student student = new Student();
        student.setName("David Langley");
        student.setDateOfBirth(new LocalDate(1996,10,10));
        
        assertEquals("DavidLangley22", student.getUsername());
    }
    
}
