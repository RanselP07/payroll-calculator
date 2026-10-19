package com.pluralsight;

import java.util.Scanner;

public class RefactorPayroll {


    public static String name(String fullName) {
        return fullName;
    }

    public static float regularPay(float hourWorked, float payRate) {
        return hourWorked * payRate;
    }

    public static double overtimePay(float hourWorked, float payRate) {
        return (((hourWorked - 40) * 1.5) + 40) * payRate;
    }

    static void main() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullName = myScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        float hoursWorked = myScanner.nextInt();

        System.out.print("Enter pay rate: ");
        float payRate = myScanner.nextInt();

        System.out.println("Name: " + name(fullName));

        if (hoursWorked > 40) {
            System.out.println("Gross Pay: " + overtimePay(hoursWorked, payRate));
        } else {
            System.out.println("Gross Pay: " + regularPay(hoursWorked, payRate));
        }

    }

    /*

    static Scanner myScanner = new Scanner(System.in);

    public static String name (){
        String fullName;

        System.out.print("Enter your name: ");
        return fullName = myScanner.nextLine();
    }

    public static double pay (){
        double hoursWorked;
        double payRate;
        double grossPay;

        System.out.print("Enter your hours worked: ");
        hoursWorked = myScanner.nextInt();

        System.out.print("Enter your rate: ");
        payRate = myScanner.nextFloat();

        if (hoursWorked <= 40){

            grossPay = hoursWorked * payRate;
        }
        else{

            double overtime = hoursWorked - 40;
            grossPay = ((overtime * 1.5) + 40) * payRate;

        }

        return grossPay;
    }

    static void main(String[] args) {

        System.out.println("Name: " + name());

        System.out.println("Gross Pay: " + pay());

    }
*/
}
