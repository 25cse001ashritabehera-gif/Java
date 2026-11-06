// Experiment 7 – Question 6 Write a program to create and use a user-defined exception (e.g. insufficient balance).

import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("Available Balance: " + balance);

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        try {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient Balance!");
            }

            balance = balance - amount;

            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
