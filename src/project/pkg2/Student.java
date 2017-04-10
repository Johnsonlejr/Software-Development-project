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
    
    /**
     * Constructor to initialize instance variables 
     * @param name name of the student
     * @param id number id for student
     * @param creditsNeeded the amount of credits the student needs to graduate
     */
    public Student(String name, int id, int creditsNeeded)
    {
        this.name = name;
        this.id = id;
        this.creditsNeeded = creditsNeeded; 
        gpa = Calculator.gpa(courses);
        creditsEarned = Calculator.creditsEarned(courses); 
    }
    
    /**
     * returns the gpa of the student
     * @return gpa the gpa of the student 
     */
    public double getGpa()
    {
        return gpa;
    }
    
    /**
     * returns the number of credits needed to graduate
     * @return creditsNeeded the number of credits needed to graduate
     */
    public int getCreditsNeeded()
    {
        return creditsNeeded;
    }
    
    /**
     * returns the name of the student
     * @return name the name of the student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * returns the id of the student
     * @return id the id number of the student
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * returns the number of the credits earned by the student
     * @return creditsEarned the number of credits earned
     */
    public int getCreditsEarned()
    {
        return creditsEarned;
    }
    
    /**
     * changes the students name
     * @param studentName the new name of the student
     */
    public void setName(String studentName)
    {
        name = studentName;
    }
    
    /**
     * changes the students id 
     * @param studentId the new number id of the student 
     */
    public void setId(int studentId)
    {
        id = studentId;
    }
    
    /**
     * changes the number of credits needed to graduate
     * @param needed 
     */
    public void setCreditsNeeded(int needed)
    {
        creditsNeeded = needed;
    }
    /**
     * calculates the gpa of the student
     */
    public void calculateGPA()
    {
        gpa = Calculator.gpa(courses);
    }
    /**
     * calculates the number of credits earned by the student
     */
    public void calculateCreditsEarned()
    {
        creditsEarned = Calculator.creditsEarned(courses);
    }
    
    /**
     * adds a course to students ArrayList of Courses
     * @param newCourse the course being added
     */
    public void addCourse(Course newCourse)
    {
        courses.add(newCourse);
    }
    
    /**
     * String conversion for the student
     * @return the string showing name gpa and credits earned
     */
    public String toString()
    {
        return name + "GPA: " + gpa + "CreditsEarned:  " + creditsEarned;
    }
}
