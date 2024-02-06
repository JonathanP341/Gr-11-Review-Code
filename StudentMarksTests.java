/*
Writer: Jonathan
Date: 2021-09-17
Finding the averages, above average students and the best student
*/

import java.util.*;

public class StudentMarksTests {
   public static void main(String[] a)
   {
   Scanner input = new Scanner(System.in);
   
   //Initializing variables that will holds students, tests, class average, best student etc
   int students;
   int tests;
   int totalTestMark = 0;
   int highestMark = 0;
   int bestStudent = 0;
   int classAvg = 0;
   
   //Part a of the question, getting number of students and tests
   System.out.print("How many students are in the class:  ");
   students = input.nextInt();
   System.out.print("How many tests have the students done:  ");
   tests = input.nextInt();
   
   
   //Holding 2 arrays, one 2d array that holds the students and their marks, the other holds the average of the students
   int[][] studentTests = new int[students][tests];
   int[] studentAvg = new int[students];
   
   //Part b, getting all of the test marks per student
   for (int i = 0; i < students; i++) {
      System.out.println("\nEnter the marks for student " + (i+1)); //Prompting user to enter the marks for student n
      for (int j = 0; j < tests; j++) {
         System.out.print("Enter test mark " + (j+1) + ": "); //ASking user to enter the mark for every nth test
         studentTests[i][j] = input.nextInt(); //Adding the mark to the 2d array
      }
   }
   System.out.println("");//Spacing out the output
   
   //Part c, getting the average for each student
   for (int i = 0; i < students; i++) {
      totalTestMark = 0; //Resetting the variable
      for (int j = 0; j < tests; j++) {
         totalTestMark += studentTests[i][j]; //Storing the mark for every test per student
      }
      totalTestMark = totalTestMark / tests; //Dividing the total mark of all tests by the number of tests
      studentAvg[i] = totalTestMark; //Adding that value to an array that holds the students average
      classAvg += totalTestMark; //Adding the students average to class average which will be divided by number of students later
      System.out.println("Student " + (i+1) + "'s average is " + totalTestMark + "%.");  //Outputting the students mark
   }
   
   classAvg = classAvg / students; //Finding the class average
   
   //Part d, outputting the student with the highest avg
   for (int i = 0; i < studentAvg.length; i++) {
       if (studentAvg[i] > highestMark) { //Checking if the students average is higher than the highest at that point
           highestMark = studentAvg[i]; //If it is higher, make that the new highest mark
           bestStudent = (i+1); //Have a variable which tracks the best student for outputting later
       }
   }
   //Printing the best student and his average
   System.out.println("\nThe best student was student " + bestStudent + " with an average of " + highestMark + "%.");
   
   System.out.println("");//Spacing out the output
   //Part e, listing the students above the class average
   for (int i = 0; i < studentAvg.length; i++) {
       if (studentAvg[i] > classAvg) {
           //Outputting if the sudent is above the average and how much they are above the class average
           System.out.println("Student " + (i+1) + " is " + (studentAvg[i] - classAvg) + "% above the class average of " + classAvg + "%.");
       }
   }

}

}
