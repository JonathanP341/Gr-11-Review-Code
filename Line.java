/*
Writer: Jonathan
Date: 2021-09-23
Making 2 classes to find the length and slope of a line segment
*/

import java.util.*;

public class Line {
    
    /*
    lengthLineSeg
    
    Takes 4 values and finds the length of the line segment using the formula
    (x2-x1)^2 + (y2-y1)^2.
    
    Parameters double x1, x2, y1, y2
    
    Returns double 
    */
    public static double lengthLineSeg(double x1, double x2, double y1, double y2) {
        double total; //Will add up total and then get square rooted
        double xDiff;
        double yDiff;
        
        //Finding the difference between x and y values to that I can find the value ^2
        xDiff = x2-x1;
        yDiff = y2-y1;
        
        //Finding the values to the power of 2 and the square root
        total = Math.pow(xDiff, 2) + Math.pow(yDiff, 2);
        total = Math.sqrt(total);
        
        //Rounding the number
        total = total * 100;
        total = Math.round(total);
        total = total / 100;
        
        return(total);
    }
    
    /*
    slopeLineSeg
    
    Takes 4 values and finds the slope of the line segment using the formula
    (y2-y1) / (x2-x1)
    
    Parameters double x1, x2, y1, y2
    
    Returns double 
    */
    public static double slopeLineSeg(double x1, double x2, double y1, double y2) {
        double slope; //Holds value of slope
        
        slope = ((y2-y1) / (x2-x1)); //Slope formula
                
        //Rounding slope
        slope = slope * 100;
        slope = Math.round(slope);
        slope = slope / 100;
        
        return(slope);
    }
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    double x1, x2, y1, y2;
    double length, slope;
    
    //Getting user input
    System.out.println("Enter x1: ");
    x1 = input.nextDouble();
    System.out.println("Enter x2: ");
    x2 = input.nextDouble();
    System.out.println("Enter y1: ");
    y1 = input.nextDouble();
    System.out.println("Enter y2: ");
    y2 = input.nextDouble();
    
    //Calling the methods
    length = lengthLineSeg(x1, x2, y1, y2);
    slope = slopeLineSeg(x1, x2, y1, y2);
    
    //Outputting the length and slope
    System.out.println("\nThe length of the line segment is " + length + " units long.");
    System.out.println("The slope of the line segment is " + slope);
    
    }    
}
