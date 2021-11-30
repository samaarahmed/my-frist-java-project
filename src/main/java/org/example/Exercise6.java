package org.example;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int input1 ;
        int input2;
        System.out.println("Kindly enter no 1 :");
        input1 = scanner.nextInt();
        System.out.println("Kindly enter no 2 :");
        input2 = scanner.nextInt();

        int add = input1 + input2 ;
        System.out.println("Addition :"+ add);
        int sub = input1 - input2;
        System.out.println("Subtraction :"+ sub);
        int div = input1 / input2 ;
        System.out.println("Division:"+ div);
        int  mul= input1 *input2;
        System.out.println("Multiplication:"+ mul);
    }
}
