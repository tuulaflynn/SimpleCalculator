/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tf.calculatorapp;

/**
 *
 * @author tuulaflynn
 */
public class CalculatorApp {

    public static void main(String[] args) {
        String userChoice = App.menuOptions();
        
        while (!userChoice.equals("5")) {
            double answer = 0.0;        // initialising variable to store result of calculation
            
            // Obtaining user input from App class (from the operandUser method)
            double num1 = App.operandUser();
            double num2 = App.operandUser();
            
            if (userChoice.equals("1")) {
                answer = SimpleCalculator.add(num1, num2);
            }
            else if (userChoice.equals("2")) {
                answer = SimpleCalculator.sub(num1, num2);
            }
            else if (userChoice.equals("3")) {
                answer = SimpleCalculator.div(num1, num2);
            }            
             else if (userChoice.equals("4")) {
                answer = SimpleCalculator.multiply(num1, num2);
            }
            
            // Displays the answer to the user if a valid input has been entered.
            if (answer == 0.0) {
                System.out.println("Operands have been deleted. ");
                System.out.println("Please enter a valid option (an integer 1-5)");
            }
            else {
            System.out.println(answer);
            } 
            
            userChoice = App.menuOptions();
        }
        
        System.out.println(App.exitMessage());
    }
}
