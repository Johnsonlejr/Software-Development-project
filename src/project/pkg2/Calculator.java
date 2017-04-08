/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author Alexander
 */
import java.util.ArrayList;

public class Calculator 
{
    public Calculator(){}
    
    public static double average(ArrayList<Assignment> list)
    {
       double total = 0;
       for (int i = 0; i < list.size(); i++)
       {
           total += list.get(i).getGrade();
       }
       return total / list.size();
    }
    
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
