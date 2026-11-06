// Experiment 6 – Q3: Print n Copies of the First Two Characters of a String

import java.util.*;

public class StringCopies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String firstTwo = str.substring(0, 2);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(firstTwo);
        }

        sc.close();
    }
}
