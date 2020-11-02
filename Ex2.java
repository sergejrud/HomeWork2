package com.company;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month number:");
        int monthNum = scan.nextInt();
        System.out.print("Enter day number:");
        int dayNum = scan.nextInt();
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthInd = monthNum - 1;

        if (1 < monthNum && monthNum > 12) {
            System.out.println("Month number is not correct!");
        } else if (dayNum > 0 && dayNum <= months[monthInd]) {
            System.out.println("Day with the " + dayNum + " number is in this month.");
        } else {
            System.out.println("There is no day with this number in this month.");
        }
    }
}
