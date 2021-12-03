package org.example;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds to convert:");
              int  input = scanner.nextInt();

                int d=60;
        int secs = input % d;
        int hour = input / d;
        int mins= hour % d;
        hour = hour / d;
        System.out.print( hour + ":" + mins + ":" + secs);
        System.out.print("\n");



    }
}
