import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * This project was made by Ethan Trombley
 * This project goal is to see what Ann's salary will be between 1-5 years by a user inputting a number 1-5
 * This code can be used and edited anyway you want it to.
 */

public class IfStatment {

    public static void main(String[] args) {

        boolean run = true;

        int salary = 92000;

        System.out.println("Ann has been working for a company for x amount of years.");
        System.out.println("\nHer Salary is $92000 yearly.");
        System.out.println("\nSee what Ann's new salary would be if she worked 1-5 years.");
        System.out.println("\nEnter a number 1-5!");

        while (run) {

            try {


                Scanner sr = new Scanner(System.in);

                int years = sr.nextInt();

                if(years == 1) {

                    run = false;

                    double r1 = salary * .02;
                    double pay1 = salary + r1;

                    System.out.println("Ann's new salary after working for 1 year is: " + pay1);



                }else if(years == 2) {

                    run = false;

                    double r2 = salary * .03;
                    double pay2 = salary + r2;

                    System.out.println("Ann's new salary after working for 2 years is: " + pay2);

                }else if(years == 3) {

                    run = false;

                    double r3 = salary * .04;
                    double pay3 = salary + r3;

                    System.out.println("Ann's new salary after working for 3 years is: " + pay3);


                }else if(years == 4) {

                    run = false;

                    double r4 = salary * .05;
                    double pay4 = salary + r4;

                    System.out.println("Ann's new salary after working for 4 years is: " + pay4);

                }else if(years == 5) {

                    run = false;

                    double r4 = salary * .06;
                    double pay4 = salary + r4;

                    System.out.println("Ann's new salary after working for 5 years is: " + pay4);

                }else {

                    System.out.println("This is not a valid number! Please enter a number 1 - 5");

                    run = true;

                    continue;
                }


            }catch(InputMismatchException e) {
                System.err.println("That is an invalid input! Please try again");

                run = true;

                continue;

            }

        }

    }
}