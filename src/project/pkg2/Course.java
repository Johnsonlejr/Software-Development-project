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
    
    public Course(String name, String prefix, int code, Calendar start, Calendar end, double grade, int gradeType)
    {
        this.name = name;
        this.prefix = prefix;
        this.courseCode = code;
        this.startDate = start;
        this.endDate = end;
        this.grade = grade;
        this.gradeType = gradeType;
        setCredits(code);
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
    
    public void setGrade(int grade)
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
    public String toString()
    {
        return getTitle() + "   Grade     Credits";
    }
    private void makeGradeScale(double testWeight, double homeworkWeight, double projectWeight, double paperWeight, double quizWeight)
    {   
        GradeScale gradeScale = new GradeScale(testWeight, homeworkWeight, projectWeight, paperWeight, quizWeight);
    }
}
