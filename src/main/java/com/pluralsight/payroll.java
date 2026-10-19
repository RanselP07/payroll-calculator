package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class payroll {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your hours worked: ");
        float hoursWorked = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter pay rate: ");
        float payRate = Float.parseFloat(scanner.nextLine());

        if (hoursWorked <= 40) {

            double grossPay = hoursWorked * payRate;
            System.out.println(name + " gross pay is " + grossPay);

        } else {

            float overtime = hoursWorked - 40;
            double grossPay = ((overtime * 1.5) + 40) * payRate;
            System.out.println(name + " gross pay is " + grossPay);

        }
    }
}