// Experiment 6 – Q2: Concatenate Two Strings and Convert the Result into Lowercase

import java.util.*;

public class StringConcatenate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result = (str1 + str2).toLowerCase();

        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}
