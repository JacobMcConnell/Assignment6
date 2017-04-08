package ca.mcgill.ecse202.a6;
//The Scanner class, and the Input/Output library are needed in order to create, write to, and read files.
import java.util.Scanner;
import java.io.*;

public class Question1 {
  public static void main(String[] args) {
    // The statement below initializes a file object, and declares it with the name 'Question1.txt'.
    File x = new File("Question1.txt");
    // Since there is a possibility that an exception is thrown when writing to files, the code
    // below is encapsulated in try/catch blocks to handle exceptions.
    try {
      // The following statement checks if a file with the name Question1.txt exists, and creates
      // one if it does not.
      if (!x.exists()) {
        x.createNewFile();
      }
      // The following few statements and the for loop write a 100 random numbers to the file.
      PrintWriter output = new PrintWriter(x);
      for (int i = 0; i < 100; i++) {
        int num = (int) (Math.random() * 10000);
        output.print(num + " ");
      }
      // It is important to close the file to save what was written, and ensure that data corruption
      // does not occur.
      output.close();
      // Here, a scanner object is created with the file created earlier as an argument to the
      // Scanner constructor.
      Scanner input = new Scanner(x);
      // An array of integers with a length of 100 elements is created, and the 100 elements from
      // the text file are placed in it.
      int[] array = new int[100];
      for (int i = 0; i < 100; i++) {
        array[i] = input.nextInt();
      }
      // The sort method is used here to sort the elements in the array containing the 100 numbers.
      java.util.Arrays.sort(array);
      // This for loop prints the elements in the sorted array, to illustrate that the 100 numbers
      // have been sorted in acsending order.
      for (int i = 0; i < 100; i++) {
        System.out.print(array[i] + " ");
      }


    }
    // In the event that an exception is thrown, this catch block prompts the user with an error
    // message.
    catch (Exception e) {
      System.out.println("Error. Please re-run the program.");
    }
  }
}
