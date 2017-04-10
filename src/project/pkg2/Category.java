/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 * This class represents a category of grades for a course
 * @author Alexander
 */
import java.util.ArrayList;

public class Category 
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
        average = Calculator.average(assignments);
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
        average = Calculator.average(assignments);
    }
    /**
     * adds an assignment to the category and calculates the new average
     * @param newAssignment the assignment being added to the category
     */
    public void addAssigment(Assignment newAssignment)
    {
        assignments.add(newAssignment);
        calculateAverage();
    }
}
