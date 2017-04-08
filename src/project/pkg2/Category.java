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
        this.name = name;
        this.weight = weight;
        average = Calculator.average(assignments);
    }
}
