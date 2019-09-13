
package bmiconverter;

import java.util.Scanner;

public class BMIconverter {

  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter weight in pounds: ");
      double weight = in.nextDouble();
      System.out.print("Enter height in inches: ");
      double height = in.nextDouble();
      double bmi = (weight *0.45359237)/Math.pow(height*0.0254,2);
      System.out.printf("Your BMI is: %.4f" ,bmi);
      
      
    }
}
