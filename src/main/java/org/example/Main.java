package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Did you say FIZZBUZZ...Let have fun ;)");
        char choice;
        Scanner scn = new Scanner(System.in);

        do {
            for (int i=1; i<=100; i++){
                if ((i%3 == 0) && (i%5 ==0)){
                    System.out.println("FizzBuzz");
                } else if (i%3 == 0) {
                    System.out.println("Fizz");
                }else if (i%5 ==0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
            }
            System.out.println("Do you want to continue ? (Y/y)");
            choice = scn.next().charAt(0); //Forgot all the program values were fixed
        }while (choice == 'Y' || choice == 'y');

    }
}