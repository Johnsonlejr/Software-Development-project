/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.SchoolTracker;

/**
 * This class creates the student
 * @author Kyle
 * @author Alex
 * @version 3
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kyle
 */
public class Student implements Serializable
{
    private double gpa;
    private int creditsNeeded;
    private String name;
    private int id;
    private int creditsEarned;
    private ArrayList courses;
    
    /**
     * Constructor to initialize instance variables 
     * @param name name of the student
     * @param id number id for student
     * @param creditsNeeded the amount of credits the student needs to graduate
     */
    public Student(String name, int id, int creditsNeeded)
    {
        this.name = name;
        this.id = id;
        this.creditsNeeded = creditsNeeded;
        courses = new ArrayList<CourseOffering>(); 
        gpa = Calculator.calculateGPA(courses);
        creditsEarned = Calculator.calculateCreditsEarned(courses); 
    }
    
    /**
     * returns the gpa of the student
     * @return gpa the gpa of the student 
     */
    public double getGpa()
    {
        return gpa;
    }
    
    /**
     * returns the number of credits needed to graduate
     * @return creditsNeeded the number of credits needed to graduate
     */
    public int getCreditsNeeded()
    {
        return creditsNeeded;
    }
    
    /**
     * returns the number of credits earned
     * @return creditsEarned the number of credits the student has
     */
    public int getCreditsEarned()
    {
        return creditsEarned;
    }
 
    /**
     * returns the name of the student
     * @return name the name of the student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * returns the id of the student
     * @return id the id number of the student
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * changes the students name
     * @param studentName the new name of the student
     */
    public void setName(String studentName)
    {
        name = studentName;
    }
    
    /**
     * changes the students id 
     * @param studentId the new number id of the student 
     */
    public void setId(int studentId)
    {
        id = studentId;
    }
    
    /**
     * changes the number of credits needed to graduate
     * @param needed 
     */
    public void setCreditsNeeded(int needed)
    {
        creditsNeeded = needed;
    }
    
    /**
     * sets the number of credits earned by the student
     * only used if the student starts using the program with credits
     * @param earned the number of credits earned
     */
    public void setCreditsEarned(int earned)
    {
        creditsEarned = earned;
    }
    
    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    }
    
    public String printCourses()
    {
        String result = new String("");
        Iterator<CourseOffering> iter = courses.iterator();
        while (iter.hasNext())
        {
            result += iter.next().toString();
        }
        
        return result;
    }
    
    /**
     * calculates the gpa of the student
     */
    public void calculateGPA()
    {
        if (courses.size() == 0)
            gpa = 0;
        else
            gpa = Calculator.calculateGPA(courses);
    }
    /**
     * calculates the number of credits earned by the student
     */
    public void calculateCreditsEarned()
    {
        creditsEarned = Calculator.calculateCreditsEarned(courses);
    }
    
    /**
     * adds a course to students ArrayList of Courses
     * @param newCourse the course being added
     */
    public void addCourse(CourseOffering newCourse)
    {
        courses.add(newCourse);
    }
    /**
     * returns a reference to the courseOffering
     * @param name the name of the courseOffering
     * @return result reference to the courseOffering
     */
    public CourseOffering getCourseOffering(String name)
    {
        int i;
        for (i = 0; i < courses.size() && !courses.get(i).equals(name); i++)
        {
        }
        CourseOffering result = (CourseOffering) courses.get(i);
        return result;
    }
    /**
     * removes a course from the student
     * @param name the name of the course
     */
    public void removeCourseOffering(String name)
    {
        int i;
        for (i = 0; i < courses.size() && !courses.get(i).equals(name); i++)
        {
        }
        courses.remove(i);
    }
    /**
     * String conversion for the student
     * @return the string showing name gpa and credits earned
     */
    public String toString()
    {
        return name + " GPA: " + gpa + " CreditsEarned:  " + creditsEarned
                + "\n" + printCourses();
    }
}
