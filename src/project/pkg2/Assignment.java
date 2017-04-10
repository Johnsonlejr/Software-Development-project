/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author Alex
 */
import java.io.Serializable;
public class Assignment implements Serializable
{
    private double grade;
    private String name;
    private String date;
    
    public Assignment(double originalGrade, String name, String date)
    {
        this.grade = originalGrade;
        this.name = name;
        this.date = date;
    }
    
    public double getGrade()
    {
        return grade;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGrade(double newGrade)
    {
        this.grade = newGrade;
    } 
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setDate(String date)
    {
        this.date = date;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public String toString()
    {
        return name + " " + grade;
    }
}
