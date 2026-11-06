// Experiment 6 – Q5: Remove the First and Last Character of a String

import java.util.*;

public class RemoveFirstLast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.substring(1, str.length() - 1);

        System.out.println("Result: " + result);

        sc.close();
    }
}
