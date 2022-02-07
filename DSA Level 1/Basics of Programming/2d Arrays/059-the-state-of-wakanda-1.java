import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            A[i] = new int[m];
            for (int j = 0; j < m; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println(A[i][j]);
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(A[i][j]);
                }
            }
        }
    }
}