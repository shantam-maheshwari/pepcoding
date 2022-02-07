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

        for (int diag = 0; diag < n; diag++) {
            int i = 0;
            int j = diag;
            while (i < n && j < n) {
                System.out.println(A[i][j]);
                i++;
                j++;
            }
        }
    }
}