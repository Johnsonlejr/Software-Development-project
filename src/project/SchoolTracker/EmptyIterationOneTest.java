/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.SchoolTracker;

/**
 *
 * @author Alexander
 */
import java.util.Scanner;
import java.util.Calendar;
public class EmptyIterationOneTest 
{
    public static void main(String[] args)
    {
        // Creating a student
        Student name = new Student("", , );
        
        // Creating a Calander object to hold start and end date for the course
        Calendar start = Calendar.getInstance();
        start.set(1,1,2016);
        Calendar end = Calendar.getInstance();
        end.set(12,1,2016);
        
        //Create the course
        Course name = new Course("", "", , start, end, , , );
        
        // Adding a course to student
        name.addCourse();
        
        // Creating categories and adding them to the course.
        Category tests = new Category("", );
        Category homework = new Category("", );
        Category quizzes = new Category("", );
        name.addCategory(homework);
        name.addCategory(tests);
        name.addCategory(quizzes);
        
        // Creating assignments
        Assignment name = new Assignment(, "");
        Assignment name = new Assignment(, "");

        
        // Adding assignments to the course
        homework.addAssignment();
        tests.addAssignment();
        
        // Calculating the grade for the course
        name.calculateGrade();
        
        // Calculating the gpa
        name.calculateGPA();
        
        // Demonstrating the 
        System.out.println(student);
        System.out.println(course);
       
    }
}
