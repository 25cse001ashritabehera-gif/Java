// Experiment 6 – Q6: Print n Repetitions of the Last n Characters of a String

import java.util.*;

public class StringLastN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            System.out.print(last);
        }

        sc.close();
    }
}
