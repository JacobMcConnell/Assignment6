package ca.mcgill.ecse202.a6;

import java.util.Scanner;

public class TimeTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter time1 (hour minute second) :");

    int hour = input.nextInt();
    int minute = input.nextInt();
    int second = input.nextInt();

    Time time1 = new Time(hour, minute, second);
    System.out.println(time1);
    System.out.println("Elapsed seconds in time1: " + time1.getSeconds());

    System.out.println("Elapsed time2 (elapsed time):");
    int second2 = input.nextInt();
    Time time2 = new Time(second2);
    System.out.println(time2);
    System.out.println("Elapsed seconds in time2:" + time2.getSeconds());
    System.out.println("");
    System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));

    System.out.println("time3 is created as a clone of time 1");
    Time time3 = (Time) time1.clone();
    System.out.println("time1.compareTo(time3)?" + time1.compareTo(time3));



  }
}

