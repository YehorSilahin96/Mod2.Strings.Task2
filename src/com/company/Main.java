package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to know actual date and time ? Enter Yes/No");
        String ans = sc.nextLine();

        //inquiry
        if (ans.equals("Yes")) {

            LocalDate date = LocalDate.now();         // Date/Time in Java 8
            LocalTime time = LocalTime.now();
            System.out.println("Current date and time:" );
            System.out.format("%tB %te, %tY%n", date, date, date);
            System.out.format("%tl:%tM %tp%n", time, time, time);
        }

        else if (ans.equals("No")) { //Fixed cycle

            System.out.println("OMG, you're so bored !");

        } else

            System.out.println("You're wrong, try again");

    }
}
