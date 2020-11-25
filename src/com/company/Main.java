package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Get user input and output answer
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Amount: ");
        double input = keyboard.nextDouble();
        System.out.println(input);

        //Assumptions
        double quarters = 0.25;
        double dimes = 0.10;
        double nickles = 0.05;
        double pennies = 0.01;


        // Repeat question until value is less than 00
       do {
           System.out.println("Amount due: ");
           Integer amount = keyboard.nextInt();
       } while (input<0.0);

        // Define quarters, dimes, nickles, and pennies


        // Define quarters, dimes, nickles, and pennies

            double due = (quarters + dimes + nickles + pennies);
            System.out.println(due);





                // Use largest coin possible

                // print number of coins needed



        }
    }


