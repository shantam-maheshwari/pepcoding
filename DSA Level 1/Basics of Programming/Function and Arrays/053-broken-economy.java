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
            System.out.println(A[left]);
        } else {
            System.out.println(A[left]);
            System.out.println(A[left - 1]);
        }
    }
}