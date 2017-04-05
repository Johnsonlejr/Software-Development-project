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
public class Assignment 
{
    private int grade;
    private String name;
    
    public Assignment(int originalGrade, String name)
    {
        this.grade = originalGrade;
        this.name = name;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGrade(int newGrade)
    {
        this.grade = newGrade;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
