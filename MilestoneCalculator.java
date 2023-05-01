/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.milestonecalculator;

/**
 *
 * @author Tone
 */
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.SpringLayout;



public class MilestoneCalculator extends JFrame {
    // Declare private variables for the Swing components
    private JLabel lblStudentName, lblStudentNo, lblMilestone1, lblMilestone2, lblTerminalAssessment;
    private JTextField txtStudentName, txtStudentNo, txtMilestone1, txtMilestone2, txtTerminalAssessment;
    private final JButton calculateButton;
    public boolean inputNegative = true, inputBeyondMax;
   
   
    public static void main(String[] args) {
        MilestoneCalculator calc = new MilestoneCalculator();
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MilestoneCalculator() {
        // Set up the frame
        super("Mapúa Malayan Digital College Milestone Calculator");
        setSize(600, 400);
        setResizable(false);
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
       


        // Create the components
        // Create labels and textfields
        lblStudentName = new JLabel("Student Name:");
        txtStudentName = new JTextField(30);
        lblStudentNo = new JLabel("Student No:");
        txtStudentNo = new JTextField(30);
        lblMilestone1 = new JLabel("Milestone 1: 25%");
        txtMilestone1 = new JTextField(10);
        lblMilestone2 = new JLabel("Milestone 2: 40%");
        txtMilestone2 = new JTextField(10);
        lblTerminalAssessment = new JLabel("Terminal Assessment: 35%");
        txtTerminalAssessment = new JTextField(10);
        calculateButton = new JButton("Calculate");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(500, 500);
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
        panel.add(calculateButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerminalAssessment, 6, SpringLayout.WEST, panel);
       
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
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 76, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 76, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerminalAssessment, 15, SpringLayout.EAST, lblTerminalAssessment);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTerminalAssessment);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button      
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                // Instantiate Student class
                Student stud = new Student();
                       
                // Assign textfield values to stud object
                stud.setStudentName(txtStudentName.getText());
                stud.setStudentNumber(txtStudentNo.getText());
                stud.setMilestone1(Float.parseFloat(txtMilestone1.getText()));
                stud.setMilestone2(Float.parseFloat(txtMilestone2.getText()));                
                stud.setTerminalAssessment(Float.parseFloat(txtTerminalAssessment.getText()));
               
               
                if (Float.parseFloat(txtMilestone1.getText()) < 0 || Float.parseFloat(txtMilestone2.getText()) < 0 || Float.parseFloat(txtTerminalAssessment.getText()) < 0) {
                    inputNegative = true;
                    ErrorHandler error = new ErrorHandler();

                } else if (Float.parseFloat(txtMilestone1.getText()) > 25 || Float.parseFloat(txtMilestone2.getText()) > 40 || Float.parseFloat(txtTerminalAssessment.getText()) > 35){
                    inputBeyondMax = true;
                    ErrorHandler error = new ErrorHandler();

                } else {
               
                // Instantiate and call GradeOutput class
                GradeOutput output = new GradeOutput(stud);
                output.setVisible(true);
               
                }
            }
        });
    }
   
}
