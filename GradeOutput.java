/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.milestonecalculator;

/**
 *
 * @author Tone
 */
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class GradeOutput extends JFrame {
    // Declare private variables for the Swing components
    private JLabel lblStudentName, lblStudentNo, lblMilestone1, lblMilestone2, lblTerminalAssessment, lblFinalGrade;
    private JTextField txtStudentName, txtStudentNo, txtMilestone1, txtMilestone2, txtTerminalAssessment, txtFinalGrade;
    private JButton closeButton;


    public GradeOutput(Student stud) {
        // Set up the frame
        super("Grade Output");
        setSize(450, 250);
        
        setResizable(false);
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());


        // Compute Average
        stud.computeAverage();


        // Create the components
        // Create labels
        lblStudentName = new JLabel("Student Name:");
        lblStudentNo = new JLabel("Student No:");
        lblMilestone1 = new JLabel("Milestone 1:");
        lblMilestone2 = new JLabel("Milestone 2:");
        lblTerminalAssessment = new JLabel("Terminal Assessment:");
        lblFinalGrade = new JLabel("Final Grade:");
       
        // Create Student Name textfield
        txtStudentName = new JTextField(30);
        txtStudentName.setEnabled(false);
        txtStudentName.setText(stud.getStudentName());
       
        // Create Student Number textfield
        txtStudentNo = new JTextField(30);
        txtStudentNo.setEnabled(false);
        txtStudentNo.setText(stud.getStudentNumber());
       
        // Create Quiz 1 textfield
        txtMilestone1 = new JTextField(10);
        txtMilestone1.setEnabled(false);
        txtMilestone1.setText(stud.getMilestone1());
       
        // Create Quiz 2 textfield
        txtMilestone2 = new JTextField(10);
        txtMilestone2.setEnabled(false);
        txtMilestone2.setText(stud.getMilestone2());
       
        // Create Quiz 3 textfield
        txtTerminalAssessment = new JTextField(10);
        txtTerminalAssessment.setEnabled(false);
        txtTerminalAssessment.setText(stud.getTerminalAssessment());
       
        // Create Average Grade textfield
        txtFinalGrade = new JTextField(10);
        txtFinalGrade.setEnabled(false);
        txtFinalGrade.setText(stud.getAveGrade());
       
        // Create Close button
        closeButton = new JButton("Close");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 300);
        panel.setLayout(layout);
       
        // Add the components to the frame
        panel.add(lblStudentName);
        panel.add(txtStudentName);
        panel.add(lblStudentNo);
        panel.add(txtStudentNo);
        panel.add(lblMilestone1);
        panel.add(txtMilestone1);
        panel.add(lblMilestone2);
        panel.add(txtMilestone2);
        panel.add(lblTerminalAssessment);
        panel.add(txtTerminalAssessment);
        panel.add(lblFinalGrade);
        panel.add(txtFinalGrade);
        panel.add(closeButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerminalAssessment, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblFinalGrade, 6, SpringLayout.WEST, panel);
       
        // Set label and textfield position: top and bottom
        layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
        layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone1, 10, SpringLayout.SOUTH, lblStudentNo);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone1, 6, SpringLayout.SOUTH, txtStudentNo);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone2, 10, SpringLayout.SOUTH, lblMilestone1);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone2, 6, SpringLayout.SOUTH, txtMilestone1);
        layout.putConstraint(SpringLayout.NORTH, lblTerminalAssessment, 10, SpringLayout.SOUTH, lblMilestone2);
        layout.putConstraint(SpringLayout.NORTH, txtTerminalAssessment, 6, SpringLayout.SOUTH, txtMilestone2);
        layout.putConstraint(SpringLayout.NORTH, lblFinalGrade, 10, SpringLayout.SOUTH, lblTerminalAssessment);
        layout.putConstraint(SpringLayout.NORTH, txtFinalGrade, 6, SpringLayout.SOUTH, txtTerminalAssessment);
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 76, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 76, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerminalAssessment, 16, SpringLayout.EAST, lblTerminalAssessment);
        layout.putConstraint(SpringLayout.WEST, txtFinalGrade, 77, SpringLayout.EAST, lblFinalGrade);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtFinalGrade);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}

