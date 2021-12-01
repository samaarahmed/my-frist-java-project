package org.example;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int input;
        int h;
        int s;
        int m;
        int d=60;
        System.out.println("Enter seconds to convert:");
                input = scanner.nextInt();
                h = input / d;
                m = h / d;
                s = h % d;
                 System.out.println(m +":"+s );


    }
}
