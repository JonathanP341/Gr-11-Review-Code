/*
Writer: Jonathan
Date: 2021-09-25
User enters numerator and divisor and code prints answer
*/
import java.util.*;

public class FoolProofing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //The boolean values are used to determine whether the cde should keep running or if the user made a mistake
        boolean exit = false;
        boolean correct = true;
        //The string values hold the user input, because we dont know if it is an int or not, the doubles hold the converted values
        String numerator;
        double numNumer = 0;
        String denom;
        double numDenom = 0;
        double answer; //Holds numNumer / numDenom
        
        //While loop to continue to prompt the user after the first time
        while (exit == false) {
            System.out.print("Enter the numerator: ");
            numerator = input.next();
            
            //If the user is trying to exit, exit the code
            if (numerator.startsWith("q") || numerator.startsWith("Q")) {
                break;
            }
            
            try { //Trying to convert the numerator to a double with a try catch
                numNumer = Double.parseDouble(numerator);
                
            } catch (Exception e) { //If the user makes a mistake, this code runs
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                correct = false; //Setting correct to false so I don't continue to run the code after the first mistake
            }
            if (correct == true) { //if the user didnt make a mistake
                System.out.print("Enter the divisor: ");
                denom = input.next();
                try { //Trying to convert the denominator to a 
                    numDenom = Double.parseDouble(denom);
                    
                    if (numDenom == 0) { //If the answer is a number, but a 0 give an error message
                        System.out.println("You cant divide " + numNumer + " by 0.");
                    }
                    if (numDenom != 0) { //If not equal to zero
                        answer = numNumer / numDenom; //Getting answer
                        answer = Math.round(answer * 100); //Rounding
                        answer = answer / 100;
                        System.out.println(numNumer + " / " + numDenom + " is " + answer); //Outputting answer
                    }
                
                } catch (Exception e) { //If the user made a mistake, output error message
                    System.out.println("You entered bad data.");
                    System.out.println("Please try again.");
                    correct = false;
                }                              
            }
                
            System.out.println(""); //Putting a space  
        }
        
        
    }
     
}
