/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
98 *
 * @author Alex
 */
import java.io.Serializable;
import java.util.Calendar;
import java.util.ArrayList;

public class Course implements Serializable 
{
    private String name;
    private String prefix;
    private int  courseCode;
    private int credits;
    private double grade;
    private int gradeType;
    private Calendar startDate;
    private Calendar endDate;
    private boolean isFinished;
    private ArrayList categories;
    
    public Course(String name, String prefix, int code, Calendar start, Calendar end, double grade, int gradeType)
    {
        this.name = name;
        this.prefix = prefix;
        this.courseCode = code;
        this.startDate = start;
        this.endDate = end;
        this.grade = grade;
        this.gradeType = gradeType;
        isFinished = false;
        categories = new ArrayList<Category>();
        setCredits(code);
    }
    
    public boolean isFinished()
    {
        return isFinished;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCourseCode()
    {
        return courseCode;
    }
    
    public String getPrefix()
    {
        return prefix;
    }
    
    public String getTitle()
    {
        return  prefix + " " + courseCode + " " + name;
    }
    
    public int getCredits()
    {
        return credits;
    }
    
    public double getGrade()
    {
        return grade;
    }
    
    public int getGradeType()
    {
        return gradeType;
    }
    
    public Calendar getStart()
    {
        return startDate;
    }
    
    public Calendar getEnd()
    {
        return endDate;
    }
    
    private void setCredits(int code)
    {
         credits = (code / 10) % 10;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setCourseCode(int code)
    {
        this.courseCode = code;
    }
    
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }
    
    public void setGrade(double grade)
    {
        this.grade = grade;
    }
    
    public void setGradeType(int gradeType)
    {
        this.gradeType = gradeType;
    }
    
    public void setEndDate(Calendar end)
    {
        this.endDate = end;
    }
    
    public void setStartDate(Calendar start)
    {
        this.startDate = start;
    }
    
    public void addAssignment(Category newCategory)
    {
        categories.add(newCategory);
        calculateGrade();
    }
    
    public void calculateGrade()
    {
        grade = Calculator.grade(categories);
    }
     
   /**DO WE STILL NEED IT
    * private void makeGradeScale()
    {   
        GradeScale gradeScale = new GradeScale(testWeight, homeworkWeight, projectWeight, paperWeight, quizWeight);
    }
    */
}
