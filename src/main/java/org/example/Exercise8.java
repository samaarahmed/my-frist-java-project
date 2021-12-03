package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    /**
     * Write a program that first generates a random number between 1 and 500
     * and stores it into a variable (see the Random class). Then let the user make a
     * guess for which number it is. If the user types the correct number, he should be
     * presented with a message (including the number of guesses he has made). If he
     * types a number that is greater or smaller than the given number, display either
     * “Your guess was too small” or “Your guess was too big”. The program should
     * keep executing until the user input the correct guess.
     */
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int  input ;
        int i=0;
        int no = rnd.nextInt(500);
        //if we want to show guess no we can run following line otherwise we can hide .
        System.out.println(no);
            while ( true)
            {
                i++;
                System.out.println("Guess the no between 1-500?");
                input = scanner.nextInt();
                if (input == no)
                {
                System.out.println("You have guessed the right no");
                System.out.println("you have tried:"+ i +" times");
                break;

            } else {
                System.out.println("Guessed no is wrong! try again");
            }

            }

    }


    }





