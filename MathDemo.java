// Experiment 7 – Question 3 Write a program to create a user-defined package for mathematical operations and use it in another class.

import java.util.*;
import mypack.MathOperations;

public class MathDemo {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int a = 20, b = 10;

        System.out.println("Addition: " + m.add(a, b));
        System.out.println("Subtraction: " + m.subtract(a, b));
        System.out.println("Multiplication: " + m.multiply(a, b));
        System.out.println("Division: " + m.divide(a, b));
    }
}
