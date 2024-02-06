/*
Writer: Jonathan
Date: 2021-09-22
Seperating the number into 2 digits sets and adding them
 */ 

import java.util.*;
public class AddPairs {
    
    public static void main(String[] a) {
    Scanner input = new Scanner(System.in);
    String numString = "";
    String holdingNum = "";
    String output = "";
    int total = 0;
    
    //Since it takes a lot of code to specify the exact length of an array, so Im using an arrayList 
    ArrayList<Integer> numPairs = new ArrayList<Integer>();
    numString = input.nextLine();
     
    //This for loop will run numString length / 2 times and will add 2 digits to the arraylist and to an output line
    for (int i = 0; i < (numString.length() - (numString.length() % 2)); i += 2) {
        //Finding the chracters at i and i+1 and adding them together
        holdingNum += numString.charAt(i);
        holdingNum += numString.charAt(i+1);
               
        numPairs.add(Integer.parseInt(holdingNum)); //Adding the integer to the arraylist
        output += holdingNum + "+";
        holdingNum = ""; //Resetting the variable
        }
    
    if (numString.length() % 2 == 1) { //If I missed a character in for loop
        holdingNum += numString.charAt(numString.length()-1); //FInding the missing character
        output += holdingNum; //Adding the integer to the output variable
        numPairs.add(Integer.parseInt(holdingNum)); //Adding the integer to the arraylist
    }
    else { //If I didnt miss a character
        output = output.substring(0, output.length()-1); //Remove the + at the end of output
    }
    
    //Adding the integers in the arrayList together
    for (int i = 0; i < numPairs.size(); i++) {
        total += numPairs.get(i);
    }
    
    //Outputting the total and the 2 digit integers
    System.out.println(total + "(" + output + ")");
}
}
