
// partial
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        while (T-- != 0) {
            // input number
            int N = scn.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scn.nextInt();
            }

            // if A[i] > max_digit so far, max_digit = A[i]
            // else, swapping A[i] and max_digit gives best candidate to form largest number
            int maxDigitIdx = N - 1;
            int leftIdx = -1;
            int rightIdx = -1;

            for (int i = N - 2; i >= 0; i--) {
                if (A[i] > A[maxDigitIdx]) {
                    maxDigitIdx = i;
                } else if (A[i] <= A[maxDigitIdx]) {
                    leftIdx = i;
                    rightIdx = maxDigitIdx;
                }
            }

            // if leftIdx == -1, digits are in descending order i.e. already largest number
            if (leftIdx != -1) {
                int temp = A[leftIdx];
                A[leftIdx] = A[rightIdx];
                A[rightIdx] = temp;
            }

            for (int a : A) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}

// Learnings:
// swapping largest digit with first digit won't always work e.g. 9678 -> 9876