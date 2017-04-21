/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.SchoolTracker;

import java.io.Serializable;

/**
 *
 * @author Alexander
 */
public class Course implements Serializable
{
    private String name;
    private int courseCode;
    private String prefix;
    private int credits;
    
    public Course(String name, String prefix, int code, int credits)
    {
        this.name = name;
        this.courseCode = code;
        this.prefix = prefix;
        this.credits = credits;
    }
    
     /**
     * returns the name of the course
     * @return name the name of the course 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * returns the course code
     * @return courseCode the code to the course
     */
    public int getCourseCode()
    {
        return courseCode;
    }
    
    /**
     * returns the prefix of the course
     * @return prefix the prefix of the course
     */
    public String getPrefix()
    {
        return prefix;
    }
    
    /** 
     * returns the entire title of the course
     * @return string concatenation of the prefix course code and name
     */
    public String getTitle()
    {
        return  prefix + " " + courseCode + " " + name;
    }
    
    /**
     * returns the number of credit hours the class is work
     * @return credits the number of credits the course is worth
     */
    public int getCredits()
    {
        return credits;
    }
    
     /**
     * changes the number of credit hours a course is worth
     * @param credits 
     */
    private void setCredits(int credits)
    {
         this.credits = credits;
    }
    
    /**
     * changes the name of the course
     * @param name the new name of the course
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * changes the course code
     * @param code the new course code
     */
    public void setCourseCode(int code)
    {
        this.courseCode = code;
    }
    
    /**
     * changes the prefix of the code
     * @param prefix 
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }
    
}
