// Experiment 7 – Question 5 Write a program to demonstrate the use of a finally block that executes regardless of exception occurrence.

import java.util.*;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block is always executed.");
        }

        sc.close();
    }
}
