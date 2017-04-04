/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 * This class creates the student
 * @author Kyle
 * @version 3
 */
public class Student 
{
    private int gpa;
    private int creditsNeeded;
    private String name;
    private int id;
    private int creditsEarned;
    
    public int getGpa()
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
    
    public void setGpa(int gradePointAverage)
    {
        gpa = gradePointAverage;
    }
    
    public void setCreditsEarned(int earned)
    {
        creditsEarned = earned;
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
}
