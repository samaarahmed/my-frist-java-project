package org.example;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Kindly enter the the year to check if its leap or not:");
         int year = scanner.nextInt();
         int leap = year % 4;
         if ( leap == 0) {
         System.out.println("This is a leap year");
         } else {
         System.out.println("This is not a leap year");
         }
    }
}
