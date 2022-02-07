import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            A[i] = new int[n];
            for (int j = 0; j < n; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int minIdx = 0;
            for (int j = 1; j < n; j++) {
                if (A[i][minIdx] > A[i][j]) {
                    minIdx = j;
                }
            }
            int maxIdx = 0;
            for (int k = 1; k < n; k++) {
                if (A[maxIdx][minIdx] < A[k][minIdx]) {
                    maxIdx = k;
                }
            }
            if (i == maxIdx) {
                System.out.println(A[i][minIdx]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}