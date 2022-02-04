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
        int d = scn.nextInt();

        int firstIndex = -1;
        int lastIndex = -1;

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] < d) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (A[left] == d) {
            firstIndex = left;
            right = n - 1;
            while (left < right) {
                int mid = left + (right - left + 1) / 2;
                if (A[mid] > d) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            lastIndex = left;
        }
        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
}

// Learnings:
// when updating right = mid, use mid = left + (right - left) / 2
// i.e. choose left middle element in case of even sized subarray A[left:right]

// when updating left = mid, use mid = left + (right - left + 1) / 2
// i.e. choose right middle element in case of even sized subarray A[left:right]