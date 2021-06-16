package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to know actual date and time ?" + " Enter Yes/No");
        String ans = sc.nextLine();

        if (ans.equals("Yes")) {

            Calendar res = Calendar.getInstance(); // Please, find an use the other ways to print date and time using java 8

            System.out.println("Current Date and Time :");
            System.out.format("%tB %te, %tY%n", res, res, res);
            System.out.format("%tl:%tM %tp%n", res, res, res);
        }

        if (ans.equals("No")) {

            System.out.println("OMG, you're so bored !");

        } else

            System.out.println("You're wrong, try again");

    }
}
