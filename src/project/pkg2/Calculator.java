/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author lajjr_000
 */
import java.util.ArrayList;

public class Calculator 
{
    public static int calculateTotalHours(ArrayList<Course> courses)
    {
        int totalHours = 0;
        for (int i = 0; i < courses.size(); i++)
            totalHours += courses.get(i).getCredits();
        
        return totalHours;
    }
    public static double calculateGPA(ArrayList<Course> courses)
    { 
        int sumStylePoints = 0;
        int sumHours = 0;
        
        for (int i = 0; i < courses.size(); i++)
        {
              int stylePoints = 0;
              char letterGrade = courses.get(i).getLetterGrade();
              if (letterGrade == 'A')
                  stylePoints = courses.get(i).getCredits() * 4;
              else if (letterGrade == 'B')
                  stylePoints = courses.get(i).getCredits() * 3;
              else if (letterGrade == 'C')
                  stylePoints = courses.get(i).getCredits() * 2;    
              else if (letterGrade == 'D')
                  stylePoints = courses.get(i).getCredits();
              
              sumStylePoints += stylePoints;
              sumHours += courses.get(i).getCredits(); 
        }
        
        double gpa = (double) sumStylePoints / sumHours;
        return gpa;
    }
    
    public static double calculateGrade(Course class)
    {
        
    }
}
