package com.company;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println("Try to guess the riddle.");
        System.out.println("Mary’s father has five daughters – Nana, Nene, Nini, Nono. What is the fifth daughter’s name?");
        System.out.println("You have 3 attempts, or press \"quit\" button to give up.");
        Scanner scan = new Scanner(System.in);
        String rightAnswer = "Mary";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Your answer: ");
            String answer = scan.nextLine();
            attempts++;

            if (answer.equalsIgnoreCase("quit")) {
                System.out.println("You lose. The right answer was " + rightAnswer);
            } else if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("You  win. This is the correct answer.");
            } else if (attempts == 3) {
                System.out.println("You lose. The right answer was " + rightAnswer);
            } else System.out.println("Try again:");
        }
    }
}





