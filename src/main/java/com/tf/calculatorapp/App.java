/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tf.calculatorapp;

import java.util.Scanner;

/**
 * @author tuulaflynn
 * email -------
 * date:
 * purpose for the class: obtaining input and some output 
 */
public class App {
    
    protected static String menuOptions() {
        // Displaying and obtaining a menu option from the user
        System.out.println("Welcome to Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter the number of the desired option: ");
        
        return userStringInput();
        }
    
    protected static String userStringInput() {
        Scanner scannerString = new Scanner(System.in);
        return scannerString.next();
    }
    
    protected static double userDoubleInput() {
        Scanner scannerDouble = new Scanner(System.in);
        return scannerDouble.nextDouble();
    }
    
    protected static double operandUser() {
        // I could make a class that I could then have objects of which had two numbers?
        System.out.print("Enter operand: ");
        return userDoubleInput();
    }
    
    protected static String exitMessage() {
      return "Thank you for using Simple Calculator. Goodbye.";
    }
    
}
