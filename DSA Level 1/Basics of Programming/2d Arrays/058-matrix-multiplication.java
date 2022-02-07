import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] A = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            A[i] = new int[m1];
            for (int j = 0; j < m1; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] B = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            B[i] = new int[m2];
            for (int j = 0; j < m2; j++) {
                B[i][j] = scn.nextInt();
            }
        }

        int[][] C = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            C[i] = new int[m2];
            for (int j = 0; j < m2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < m1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}