/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.SchoolTracker;

/**
 * This class represents a category of grades for a course
 * @author Alexander
 */
import java.util.ArrayList;
import java.io.Serializable; 

/**
 *
 * @author Kyle
 */
public class Category implements Serializable
{
    private double weight;
    private String name;
    private double average;
    private ArrayList assignments;
    /**
     * Constructor initializes instance variables
     * @param name the name of the category
     * @param weight the weight that this category has in calculating the grade for the course
     */
    public Category(String name, double weight)
    {
        assignments = new ArrayList<Assignment>();
        this.name = name;
        this.weight = weight;
        average = Calculator.calculateAverage(assignments);
    }
    
    /**
     * returns the average grade for the category
     * @return 
     */
    public double getAverage()
    {
        return average;
    }
    
    /**
     * returns the categories weight
     * @return weight the weight of the category
     */
    public double getWeight()
    {
        return weight;
    }
    
    /**
     * returns the name of the category
     * @return name the name of the category
     */
    public String getName()
    {
        return name;
    }
    
    /** 
     * changes the name of the category
     * @param newName the new name of the category
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    /**
     * changes the weight of category
     * @param newWeight the new weight of the category
     */
    public void setWeight(double newWeight)
    {
        this.weight = newWeight;
    }
    /**
     * calculates the average of the assignments in the category
     */
    public void calculateAverage()
    {
        if (assignments.size() == 0)
            average = -1;
        else
            average = Calculator.calculateAverage(assignments);
    }
    /**
     * adds an assignment to the category and calculates the new average
     * @param newAssignment the assignment being added to the category
     */
    public void addAssignment(Assignment newAssignment)
    {
        assignments.add(newAssignment);
        calculateAverage();
    }
    
    public Assignment getAssignment(String name)
    {
        int i;
        for (i = 0; i < assignments.size() && !assignments.get(i).equals(name); i++)
        {
        }
        Assignment result = (Assignment) assignments.get(i);
        return result; 
    }
    public String toString()
    {
        String result = "Category Name: " + name + " Category Weight: " +  weight + "\n";
        for (int i = 0; i < assignments.size(); i++)
        {
            result += assignments.get(i).toString() + "\n";
        }
        return result;
    }
}
