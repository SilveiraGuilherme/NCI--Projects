/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentidapp;

/**
 *
 * @author guilhermesilveira
 */

import javax.swing.JOptionPane;

public class StudentIDApp {

    public static void main(String[] args) {
        // Declare variables
        String studentID;
        boolean isIDValid;
		
	//Declare and Create objects
	StudentID myS = new StudentID();

	// Input
	studentID = JOptionPane.showInputDialog(null, "Please, enter your Student ID in the following format: ab-12345678");

	// Process
	myS.setStudentID(studentID);
	myS.compute();
		
	//Output
	isIDValid = myS.getIsIDValid();
		
	JOptionPane.showMessageDialog(null, "Student ID: " + studentID + " is: " + isIDValid + ".");
    }
}
