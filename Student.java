/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.milestonecalculator;

/**
 *
 * @author Tone
 */
public class Student {
    //attributes
    private String studentNumber;
    private String studentName;
    private float milestone1;
    private float milestone2;
    private float terminalAssessment;
    private float averageGrade;
   
    //getter and setter methods
    //getter methods
    public String getStudentNumber() {
        return studentNumber;
    }
   
    public String getStudentName() {
        return studentName;
    }
   
    public String getMilestone1() {
        return String.valueOf(milestone1);
    }
   
    public String getMilestone2() {
        return String.valueOf(milestone2);
    }
   
    public String getTerminalAssessment() {
        return String.valueOf(terminalAssessment);
    }
   
    public String getAveGrade() {
        return String.valueOf(averageGrade);
    }
    
    //setter methods
    public void setStudentNumber(String studNumber) {
        studentNumber = studNumber;
    }
   
    public void setStudentName(String studName) {
        studentName = studName;
    }
   
    public void setMilestone1(float m1) {
        milestone1 = m1;
    }
    
    public void setMilestone2(float m2) {
        milestone2 = m2;
    }
   
    public void setTerminalAssessment(float ta) {
        terminalAssessment = ta;
    }
   
    //methods
    public float computeAverage() {
    	
    	if (milestone1 >= 0 && milestone2 >= 0 && terminalAssessment >= 0) {
        averageGrade = (milestone1 + milestone2 + terminalAssessment);
    	}
        return averageGrade;
    	
    }
}

