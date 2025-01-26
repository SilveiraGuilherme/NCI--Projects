/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentidapp;

/**
 *
 * @author guilhermesilveira
 */
public class StudentID {
    // Declare variables
    private String studentID;
    private boolean firstValid = false, secondValid = false, thirdValid = false, isIDValid = false, lengthValid = false, numsValid = false;
		
    //Constructor
    public StudentID() {
    }
		
    // Setter
    public void setStudentID(String studentID) {
	this.studentID = studentID;
    }		
		
    //Compute
    public void compute() {
        // Convert StudentID to lowercase
        studentID = studentID.toLowerCase();
        
        // Check for x/first character
        if(studentID.charAt(0) == 'x') {
            firstValid = true;
        System.out.println("first/X is true");
        }
        if(studentID.charAt(1) == 'y') {
            secondValid = true;
        System.out.println("second/Y is true");
        }
        if(studentID.charAt(2) == '-') {
            thirdValid = true;
        System.out.println("third/- is true");
        }
        if(studentID.length() == 11) {
            lengthValid = true;
        System.out.println("length is true");
        }
	for(int i = 3; i < studentID.length(); i++) {
            if (studentID.charAt(i) == '1' && studentID.charAt(i) == '2' && studentID.charAt(i) == '3') {
                numsValid = true;
                System.out.println("Character " + i + " is true");
            }
	}
        if(firstValid == true && secondValid == true && thirdValid == true && lengthValid == true && numsValid == true) {
            isIDValid = true;
        }
    }

    // Getters
    public boolean getIsIDValid() {
        return isIDValid;
    }
}
