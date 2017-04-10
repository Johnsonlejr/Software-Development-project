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
import java.util.ArrayList;

public class Calculator 
{
    /**
     * Empty constructor all methods are static no need to create object
     */
    public Calculator(){}
    
    /** 
     * calculates the average grade of the assignments
     * @param list all the assignments of a category
     * @return average grade of assignments
     */
    
    public static double average(ArrayList<Assignment> list)
    {
       double total = 0;
       for (int i = 0; i < list.size(); i++)
       {
           total += list.get(i).getGrade();
       }
       return total / list.size();
    }
    
    /**
     * calculates the grade for the course
     * @param list all of the categories for a course
     * @return total the grade for the course
     */
    
    public static double grade(ArrayList<Category> list)
    {
        double total = 0;
        Category current;
        for (int i = 0; i < list.size(); i++)
        {
            current = list.get(i);
            double weight = current.getWeight();
            double average = current.getAverage();
            total += (weight * average);
        }
        return total;
    }
    
    
    /**
     * 
     * @param list all the courses for the student
     * @return the gpa of the student 
     */
    
    public static double gpa(ArrayList<Course> list)
    {
        double hours = 0;
        double points = 0;
        Course current;
        for (int i = 0; i < list.size(); i++)
        {
            current = list.get(i);
            hours += current.getCredits();
            points += gpaPoints(current);
        }
        return points / hours;
    }
    
    /**
     * calculates the credits a student has earned
     * @param list all the courses for the student
     * @return the credits that a student has earned
     */
    
    public static int creditsEarned(ArrayList<Course> list)
    {
        int creditsEarned = 0;
        Course current;
        for (int i = 0; i < list.size(); i++)
        {
            current = list.get(i);
            if (current.isFinished() && current.getGrade() >= 60)
                creditsEarned = current.getCredits();
        }
        return creditsEarned;
    }
    
    /**
     * calculates the amount of points that a student has earned from a given 
     * course based on their grade
     * @param course
     * @return the number of grade points earned in the course
     */
    
    private static double gpaPoints(Course course)
    {
        double grade = course.getGrade();
        if (grade < 60)
            return 0;
        else if (grade < 70)
            return course.getCredits();
        else if (grade < 80)
            return 2 * course.getCredits();
        else if (grade < 90)
            return 3 * course.getCredits();
        else
            return 4 * course.getCredits();
    }    
}
