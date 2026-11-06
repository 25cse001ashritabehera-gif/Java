// Experiment 2 – Q3: Find the Largest 2 and Smallest 2 Numbers in an Array

import java.util.*;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 array elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Smallest 2 numbers: " + arr[0] + " and " + arr[1]);

        System.out.println("Largest 2 numbers: " + arr[4] + " and " + arr[3]);

        sc.close();
    }
}
