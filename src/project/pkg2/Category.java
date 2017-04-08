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

public class Category 
{
    private double weight;
    private String name;
    private double average;
    private ArrayList assignments;
    
    public Category(String name, double weight)
    {
        assignments = new ArrayList<Assignment>();
        this.name = name;
        this.weight = weight;
        average = Calculator.average(assignments);
    }
    
    public double getAverage()
    {
        return average;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public void setWeight(double newWeight)
    {
        this.weight = newWeight;
    }
    
    public void calculateAverage()
    {
        average = Calculator.average(assignments);
    }
    
    public void addAssigment(Assignment newAssignment)
    {
        assignments.add(newAssignment);
        calculateAverage();
    }
}
