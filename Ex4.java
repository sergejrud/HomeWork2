package com.company;

import java.util.Scanner;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number (from 0 to 100): ");
        int num = scan.nextInt();
        int minNum = 0;
        int maxNum = 100;
        int count = 1;
        Random rand = new Random();

        while (true) {
            int guess = rand.nextInt(maxNum - minNum + 1) + minNum;
            if (guess == num) {
                System.out.println("The program guessed your number. Number of attempts: " + count);
                break;
            }
            count++;
        }
    }
}
