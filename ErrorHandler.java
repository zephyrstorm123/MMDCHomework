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
import java.awt.event.*;

public class ErrorHandler {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblBelowZero;
	private JButton closeButton;
    MilestoneCalculator calc = new MilestoneCalculator();	
    // Set the milestone1, milestone2, and terminalAssessment variables
    JFrame frame = new JFrame();	
	
	public ErrorHandler() {
		
	    frame.setTitle("An Error Occurred!");
	    frame.setSize(450, 105);
	    ImageIcon icon = new ImageIcon("icon.png");
	    frame.setIconImage(icon.getImage());    

	    
	    JPanel panel = new JPanel();
	    SpringLayout layout = new SpringLayout();
	    
	    
	    if (calc.inputNegative) {	        
	    	lblBelowZero = new JLabel("Entered grade is below zero or Input exceeded maximum points.");
	    	closeButton = new JButton("Close");
	    	panel.add(lblBelowZero);
	    	panel.add(closeButton);
	        
	    	layout.putConstraint(SpringLayout.NORTH, lblBelowZero, 10, SpringLayout.NORTH, panel);
	    	layout.putConstraint(SpringLayout.WEST, lblBelowZero, 10, SpringLayout.WEST, panel);
	    	layout.putConstraint(SpringLayout.EAST, lblBelowZero, -35, SpringLayout.EAST, panel);
	    	
	    	layout.putConstraint(SpringLayout.NORTH, closeButton, 10, SpringLayout.SOUTH, lblBelowZero);
	    	layout.putConstraint(SpringLayout.WEST, closeButton, -120, SpringLayout.WEST, lblBelowZero);
	    	layout.putConstraint(SpringLayout.EAST, closeButton, -120, SpringLayout.EAST, lblBelowZero);
	    	layout.putConstraint(SpringLayout.SOUTH, closeButton, -10, SpringLayout.SOUTH, panel);
	    	
	        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, lblBelowZero, 0, SpringLayout.HORIZONTAL_CENTER, panel);
	        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);
	    }
	    
	    panel.setLayout(layout);
	    frame.setContentPane(panel);
	    frame.setVisible(true);
	    
	    closeButton.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
	}
	
}

