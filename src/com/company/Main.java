package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heroes rogue = new Heroes(110, 10);
        Heroes warrior = new Heroes(90, 30);
        Heroes mage = new Heroes(100, 20);
        int choice;

        do {
            System.out.println("*************************");
            System.out.println("*  Welcome to our game  *");
            System.out.println("*                       *");
            System.out.println("*   Choose your hero!   *\n" +
                    "*   1. Rogue            *\n" +
                    "*   2. Warrior          *\n" +
                    "*   3. Mage             *");
            System.out.println("*************************");
            System.out.print("> " );
            choice = input.nextInt();
        } while (choice != 1 && choice != 2 && choice != 3);
        switch (choice) {
            case 1:
                System.out.println("*************************");
                System.out.println("You choose Rogue!");
                rogue.rouge();
                System.out.println("*************************");
                break;
            case 2:
                System.out.println("*************************");
                System.out.println("You choose Warrior!");
                warrior.warrior();
                System.out.println("*************************");
                break;
            case 3:
                System.out.println("*************************");
                System.out.println("You choose Mage!");
                mage.mage();
                System.out.println("*************************");
                break;
        }
        // Map with options to go.
      /*  System.out.println("\nOh a monster is in the way of your journey");
        do {
            System.out.println("What Do you want to do?\n1. Attack \n2. Run away");
            choice = input.nextInt();
        } while (choice != 1 && choice != 2) ;
        switch (choice) {
            case 1:
                //Simons combat
                break;
            case 2:
                System.out.println("You did run away");
                break;
        }*/
    }
}
