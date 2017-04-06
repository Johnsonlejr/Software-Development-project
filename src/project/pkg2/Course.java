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
public class Course implements Serializable 
{
    private String name;
    private String prefix;
    private int  courseCode;
    private int credits;
    private double grade;
    private int gradeType;
    private Date startDate;
    private Date endDate;
    
    public Course(String name, String prefix, int code, Date start, Date end, double grade, int gradeType)
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
    public Date getStart()
    {
        return startDate;
    }
    public Date getEnd()
    {
        return endDate;
    }
    
    private int setCredits(int code)
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
    public void setEndDate(Date end)
    {
        this.endDate = end;
    }
    public void setStartDate(Date start)
    {
        this.startDate = start;
    }
    private void makeGradeScale(double testWeight, double homeworkWeight, double projectWeight, double paperWeight, double quizWeight)
    {   
        GradeScale gradeScale = new GradeScale(testWeight, homeworkWeight, projectWeight, paperWeight, quizWeight);
    }
}
