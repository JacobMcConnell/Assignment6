package ca.mcgill.ecse202.a6;
import java.util.Scanner;

public class Question1 {
  public static void main (String[] args){
    java.io.File x = new java.io.File("Question1.txt");
    System.out.println(x.exists());
    try{
      if (! x.exists()) {
        x.createNewFile();
        //java.io.PrintWriter output = new java.io.PrintWriter(x);
        //output.print("a");
        //System.out.println(x.getAbsolutePath());
        //output.close();
        }
    if ( x.exists()) {
      //x.createNewFile();
      java.io.PrintWriter output = new java.io.PrintWriter(x);
      for (int i = 0; i<100; i++){
        int num = (int)(Math.random()*10000);
        output.print(num+" ");
      } 
      
      System.out.println(x.getAbsolutePath());
      output.close();
      Scanner input = new Scanner(x);
      int[] array = new int[100];
      for (int i=0;i<100;i++){
        array[i]=input.nextInt();
      }
      
      java.util.Arrays.sort(array);
      for (int i=0;i<100;i++){
        System.out.print(array[i]+" ");
      }
      
      }
    } catch(Exception e){
      System.out.println("something went wrong");
    }
    System.out.println(x.exists());
   
  }
}