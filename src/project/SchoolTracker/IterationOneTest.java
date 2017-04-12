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
public class IterationOneTest 
{
    public static void main(String[] args)
    {
        // Creating a student
        Student alex = new Student("Alex", 123456, 124);
        
        // Creating a Course
        Calendar start = Calendar.getInstance();
        start.set(1,1,2016);
        Calendar end = Calendar.getInstance();
        end.set(12,1,2016);
        Course csci = new Course("Python", "CSCI", 238, start, end , 0, 0, 3);
        
        // Adding a course to student
        alex.addCourse(csci);
        
        // Creating categories and adding them to the course.
        Category tests = new Category("Test", 60);
        Category homework = new Category("Homework", 10);
        Category quizzes = new Category("Quiz", 30);
        csci.addCategory(homework);
        csci.addCategory(tests);
        csci.addCategory(quizzes);
        
        // Creating assignments
        Assignment test1 = new Assignment(90, "Test #1");
        Assignment test2 = new Assignment(75, "Test #2");
        Assignment quiz1 = new Assignment(70, "Quiz #1");
        Assignment quiz2 = new Assignment(95, "Quiz #2");
        Assignment homework1 = new Assignment(85, "Homework #1");
        Assignment homework2 = new Assignment(100, "Homework #2");
        Assignment homework3 = new Assignment(90, "Homework #3");
        
        // Adding assignments to the course
        homework.addAssignment(homework1);
        tests.addAssignment(test1);
        quizzes.addAssignment(quiz1);
        homework.addAssignment(homework2);
        homework.addAssignment(homework3);
        tests.addAssignment(test2);
        quizzes.addAssignment(quiz2);
        
        // Calculating the grade for the course
        csci.calculateGrade();
        
        // Calculating the gpa
        alex.calculateGPA();
        
        // Demonstrating the 
        System.out.println(alex);
        System.out.println(csci);
       
    }
}
