/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author Kyle
 */
public class GradeScale
{
    private double testWeight;
    private double homeworkWeight;
    private double quizWeight;
    private double projectWeight;
    private double paperWeight;
    
    public GradeScale(double test, double homework, double project, double paper, double quiz)
    {
        testWeight = test;
        homeworkWeight = homework;
        quizWeight = quiz;
        projectWeight = project;
        paperWeight = paper;
    }
    
    public double getTest()
    {
        return testWeight;
    }
    
    public double getHomework()
    {
        return homeworkWeight;
    }
    
    public double getQuiz()
    {
        return quizWeight;
    }
    
    public double getProject()
    {
        return projectWeight;
    }
    
    public double getPaper()
    {
        return paperWeight;
    }
    
    public void setTest(double test)
    {
        testWeight = test;
    }
    
    public void setHomework(double homework)
    {
        homeworkWeight = homework;
    }
    
    public void setQuiz(double quiz)
    {
        quizWeight = quiz;
    }
    
    public void setProject(double project)
    {
        projectWeight = project;
    }
    
    public void setPaper(double paper)
    {
        paperWeight = paper;
    }
}
