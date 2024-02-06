/*
Writer: Jonathan
Date: 2021-09-18/19
Encrypting a string by changing first and last letter and changing the ascii value 
*/
import java.util.*;

public class Encypt {
    public static void main(String[] a) {
    Scanner input = new Scanner(System.in);
    //Initializing 3 string variables, one holds the original string, one a shifted word, one the complete shifted word
    String word;
    String editedWord = "";
    String newWord = "";
    
    int asciiValue; //Holding the ascii value
    boolean firstLetter = true; //Checks if the code has gone over the first letter yet
    char letterOne = ' '; //Holding the first letter
    char lastLetter = ' '; //Holding the second letter
    
    System.out.print("Enter a line to be encrypted: ");
    word = input.nextLine();
    
    //For loop runs through every letter of the string
    for (int i = 0; i < word.length(); i++) {
        if (firstLetter == true) { //If the code hasnt gove over the first letter of the word yet
            letterOne = word.charAt(i); //Set letterOne to the first letter
            firstLetter = false;
        }
        else if ((int)word.charAt(i) == 32) { //Asciivalue of a space is 32, so if the character is a space
            lastLetter = word.charAt(i-1); //Since this looks at the space, which isnt the last letter, so you must do i-1
            firstLetter = true; //End of the word so set the boolean value back to true
            if (newWord.length() > 0) { //If something has been added to the new string before
                newWord += " ";
            }
            if (editedWord.length() > 0) {
                editedWord = editedWord.substring(0, editedWord.length()-1); //Because this looks at the space, you must remove the value before it
                newWord += lastLetter + editedWord + letterOne; //Adding the shifted word to the new complete sentence
            }
            else { //Incase the word is 1 letter 
                newWord += letterOne;
            }
            //Resetting the following values
            lastLetter = ' ';
            letterOne = ' ';
            editedWord = "";
        }
        else if (word.length() == (i+1)) { //If its at the end of the string
            lastLetter = word.charAt(i);
            firstLetter = true; 
            if (newWord.length() > 0) { //Adding a space if other words have been added
                newWord += " ";
            }
            //Adding the shifted word to the new complete sentence
            newWord += lastLetter + editedWord + letterOne;
        }
        else if ((int)word.charAt(i) > 32) { //If the letter is in the middle of the word
            asciiValue = (int)word.charAt(i)+2; //Shift the asciivalue of the word by 2
            editedWord += (char)asciiValue; //Add the shifted letter back to a string
        }
    }
    //If there is only 1 letter, brint out the first letter
    if (newWord.length() == 0) {
        System.out.println("The ecryption is: " + letterOne);
    }
    else {
        System.out.println("The ecryption is: " + newWord);
    }
    
    }
}
