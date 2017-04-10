/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 * Class that creates the grade scale for the courses
 * @author Kyle
 */
public class GradeScale
{
    private double testWeight;
    private double homeworkWeight;
    private double quizWeight;
    private double projectWeight;
    private double paperWeight;
    
    /** constructor for the gradeScale object
     * 
     * @param test
     * @param homework
     * @param project
     * @param paper
     * @param quiz 
     */
    public GradeScale(double test, double homework, double project, double paper, double quiz)
    {
        testWeight = test;
        homeworkWeight = homework;
        quizWeight = quiz;
        projectWeight = project;
        paperWeight = paper;
    }
    
    /** returns the test weight
     * 
     * @return testWeight the weight of the tests
     */
    public double getTest()
    {
        return testWeight;
    }
    
    /** returns  the homework weight
     * 
     * @return homeworkWeight the weight of the homeworks
     */
    public double getHomework()
    {
        return homeworkWeight;
    }
    
    /** returns the quiz weight
     * 
     * @return quizWeight the weight of the quizzes
     */
    public double getQuiz()
    {
        return quizWeight;
    }
    
    /** returns the weight of the projects
     * 
     * @return projectWeight the weight of the projects
     */
    public double getProject()
    {
        return projectWeight;
    }
    
    /** returns the weight of the papers
     * 
     * @return paperWeight the weight of the papers
     */
    public double getPaper()
    {
        return paperWeight;
    }
    
    /** sets the weight of the tests
     * 
     * @param test 
     */
    public void setTest(double test)
    {
        testWeight = test;
    }
    
    /** set the weight of homework
     * 
     * @param homework 
     */
    public void setHomework(double homework)
    {
        homeworkWeight = homework;
    }
    
    /** set the weight of the quizzes
     * 
     * @param quiz 
     */
    public void setQuiz(double quiz)
    {
        quizWeight = quiz;
    }
    
    /** set the weight of the projects
     * 
     * @param project 
     */
    public void setProject(double project)
    {
        projectWeight = project;
    }
    
    /** set the weight for papers
     * 
     * @param paper 
     */
    public void setPaper(double paper)
    {
        paperWeight = paper;
    }
}
