/*
Writer: Jonathan
Date: 2021-09-26
Creates a text file with a table of the powers of 2 in html format
 */

import java.util.*;
import java.io.*;
public class TwoPowerTable {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int powerUntil;
        String fileName = "TwoPowerTable.html"; //Setting the file to the variable filename
        
        powerUntil = input.nextInt();
        int value; //Holding the value of i^2
        
        try //using try catch to print onto the file
        {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName ,false));
            //Putting in the header info required for html
            out.write("<html><head>\n");
            out.write("<title>Powers of Two</title>\n");
            out.write("</head>\n");
            out.write("<body>\n");
            out.write("<table border cellpadding=5>\n");
            out.write("<tr><th>Power of 2</th><th>Value</th></tr>\n");
            //For loop to output each value of i^2 in html format
            for (int i = 0; i < powerUntil; i++) {
                value = (int)Math.pow(i, 2);
                out.write("<tr><td>" + i + "</td><td>" + value + "</td></tr>\n");
            }
            //Ending the html 
            out.write("</table>\n");
            out.write("</body></html>\n");
            
            out.close(); //Closing the file
            
        }
        catch (IOException e) { //Need a catch statement just incase 
            System.out.println(e + " problem writing " + fileName);
        }
        
    }
}
