/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.SchoolTracker;

/**
 * This represents a course that a student is taking
 * @author Alex
 */
import java.io.Serializable;
import java.util.Calendar;
import java.util.ArrayList;

/**
 *
 * @author Kyle
 */
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
    /**
     * Constructor initializes the course
     * @param name
     * @param prefix
     * @param code
     * @param start
     * @param end
     * @param grade
     * @param gradeType
     * @param credits 
     */
    public Course(String name, String prefix, int code, Calendar start, Calendar end, double grade, int gradeType, int credits)
    {
        this.name = name;
        this.prefix = prefix;
        this.courseCode = code;
        this.startDate = start;
        this.endDate = end;
        this.grade = grade;
        this.gradeType = gradeType;
        this.credits = credits;
        isFinished = false;
        categories = new ArrayList<Category>();
    }
    
    /**
     * returns whether or not the course is finished
     * @return isFinished boolean variable representing if course is finished or not
     */
    public boolean isFinished()
    {
        return isFinished;
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
     * returns the grade in the class
     * @return grade the grade in the class
     */
    public double getGrade()
    {
        return grade;
    }
    
    /**
     * returns the grade type of the course
     * @return gradeTyoe the grade type of the class
     */
    public int getGradeType()
    {
        return gradeType;
    }
    
    /**
     * returns the start date of the course
     * @return startDate the start date of the course
     */
    public Calendar getStart()
    {
        return startDate;
    }
    
    /**
     * returns the end date of the course
     * @return endDate the end date of the course
     */
    public Calendar getEnd()
    {
        return endDate;
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
    
    /**
     * changes the grade type
     * @param gradeType the new grade type
     */
    public void setGradeType(int gradeType)
    {
        this.gradeType = gradeType;
    }
    
    /**
     * changes the end date of the course
     * @param end the end date of the course
     */
    public void setEndDate(Calendar end)
    {
        this.endDate = end;
    }
    
    /**
     * changes the start date of the course
     * @param start the start date of the course
     */
    public void setStartDate(Calendar start)
    {
        this.startDate = start;
    }
    
    /**
     * adds a category to the course
     * @param newCategory the category being added
     */
    public void addCategory(Category newCategory)
    {
        categories.add(newCategory);
        calculateGrade();
    }
    
    /**
     * calculates the grade of the course
     */
    public void calculateGrade()
    {
        grade = Calculator.calculateGrade(categories);
    }
    //TODO
    public String toString()
    {
       String result = name + " Grade: " + grade + "\n";
       for (int i = 0; i < categories.size(); i++)
       {
           result += categories.get(i).toString() + "\n";
       }
       return result;
    }
}
