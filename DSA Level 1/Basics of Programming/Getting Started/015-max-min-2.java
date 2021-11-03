import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }

        int largest = A[0];
        int smallest = A[0];
        int secondLargest = 0;
        int secondSmallest = 0;

        for (int i = 1; i < n; i++) {
            if (A[i] > largest) {
                secondLargest = largest;
                largest = A[i];
            } else if (A[i] > secondLargest) {
                secondLargest = A[i];
            } else if (A[i] < smallest) {
                secondSmallest = smallest;
                smallest = A[i];
            } else if (A[i] < secondSmallest) {
                secondSmallest = A[i];
            }
        }
        System.out.println(secondLargest + " " + secondSmallest);
    }
}

// Learnings:
// checking A[i] > largest and A[i] < smallest are not sufficient