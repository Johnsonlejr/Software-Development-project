/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 * This class creates the student
 * @author Kyle
 * @author Alex
 * @version 3
 */
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{
    private double gpa;
    private int creditsNeeded;
    private String name;
    private int id;
    private int creditsEarned;
    private ArrayList courses;
    
    public Student(String name, int id, int creditsNeeded)
    {
        this.name = name;
        this.id = id;
        this.creditsNeeded = creditsNeeded; 
        gpa = Calculator.gpa(courses);
        creditsEarned = Calculator.creditsEarned(courses); 
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public int getCreditsNeeded()
    {
        return creditsNeeded;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public int getCreditsEarned()
    {
        return creditsEarned;
    }
    
    public void setName(String studentName)
    {
        name = studentName;
    }
    
    public void setId(int studentId)
    {
        id = studentId;
    }
    
    public void setCreditsNeeded(int needed)
    {
        creditsNeeded = needed;
    }
    
    public void calculateGPA()
    {
        gpa = Calculator.gpa(courses);
    }
    
    public void calculateCreditsEarned()
    {
        creditsEarned = Calculator.creditsEarned(courses);
    }
    
    public void addCourse(Course newCourse)
    {
        courses.add(newCourse);
    }
    
    public String toString()
    {
        return name;
    }
}
