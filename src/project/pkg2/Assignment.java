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
    
    public Assignment(double originalGrade, String name)
    {
        this.grade = originalGrade;
        this.name = name;
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
}
