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

        int max1 = A[0];
        int max2 = Integer.MIN_VALUE;
        int min1 = A[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            }
            if (A[i] < min1) {
                min2 = min1;
                min1 = A[i];
            } else if (A[i] < min2) {
                min2 = A[i];
            }
        }
        System.out.println(max2 + " " + min2);
    }
}

// Learnings:
// checking A[i] > largest and A[i] < smallest are not sufficient