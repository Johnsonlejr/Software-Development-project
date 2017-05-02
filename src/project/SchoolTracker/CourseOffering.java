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
    private boolean isFinished;
    private boolean bGrade;
    private ArrayList categories;
    /**
     * Constructor initializes the course
     * @param start
     * @param end
     * @param grade
     * @param gradeType
     */
    public CourseOffering(Course course, int gradeType, boolean finished, double grade)
    {
        this.course = course;
        this.gradeType = gradeType;
        isFinished = finished;
        if (gradeType == 0 && grade  == 0)
            this.grade = 60;
        else 
            this.grade = 0;
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
   
    public boolean getBGrade()
    {
        return bGrade;
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
    public void setFinished(boolean finished)
    {
        isFinished = finished;
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
    public Category getCategory(String name)
    {
        int i;
        for (i = 0; i < categories.size() && !categories.get(i).equals(name); i++)
        {
        }
        Category result = (Category) categories.get(i);
        return result;   
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
