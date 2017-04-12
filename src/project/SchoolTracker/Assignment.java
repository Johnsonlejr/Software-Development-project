/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.SchoolTracker;

/**
 * This class represents an assignment with a grade a name 
 * the assigned date and a due date
 * @author Alex
 */
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Kyle
 */
public class Assignment implements Serializable
{
    private double grade;
    private String name;
    private Calendar assigned;
    private Calendar dueDate;
    
    /**
     * constructor initializes all instance variable
     * @param originalGrade the first grade given on an assignment
     * @param name name of the assignment
     */
    
    public Assignment(double originalGrade, String name)
    {
        this.grade = originalGrade;
        this.name = name;
 
    }
    /**
     * returns the grade of the assignment
     * @return grade the grade of an assignment
     */
    public double getGrade()
    {
        return grade;
    }
    
    /**
     * returns the name of the assignment
     * @return name the name of the assignment
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * changes the grade of the assignment
     * @param newGrade 
     */
    public void setGrade(double newGrade)
    {
        this.grade = newGrade;
    }
    /**
     * changes the name of the assignment
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * toString method
     * @return the name and grade of the assignment as strings
     */
    public String toString()
    {
        return "Name: " + name + " Grade: " + grade;
    }
}
