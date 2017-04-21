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
public class CourseOffering implements Serializable 
{
    private Course course;
    private double grade;
    private int gradeType;
    private Calendar startDate;
    private Calendar endDate;
    private boolean isFinished;
    private ArrayList categories;
    /**
     * Constructor initializes the course
     * @param start
     * @param end
     * @param grade
     * @param gradeType
     */
    public CourseOffering(Course course, Calendar start, Calendar end, double grade, int gradeType, int credits)
    {
        this.course = course;
        this.startDate = start;
        this.endDate = end;
        this.grade = grade;
        this.gradeType = gradeType;
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
     * returns a reference to the course object
     * @return course reference to the course object
     */
    public Course getCourse()
    {
        return course;
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
        //calculateGrade();
    }
    
    /**
     * calculates the grade of the course
     */
    public void calculateGrade()
    {
        grade = Calculator.calculateGrade(categories);
    }
    
    public String toString()
    {
       String result = course.getName() + " Grade: " + grade + "\n";
       for (int i = 0; i < categories.size(); i++)
       {
           result += categories.get(i).toString() + "\n";
       }
       return result;
    }
}
