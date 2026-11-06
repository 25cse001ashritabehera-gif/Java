// Experiment 7 – Question 4 Write a program that handles multiple exceptions such as ArrayIndexOutOfBoundsException and ArithmeticException.

import java.util.*;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Array element: " + arr[index]);

            System.out.print("Enter a number to divide 100 by: ");
            int num = sc.nextInt();

            System.out.println("Result: " + (100 / num));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}
