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

        transpose(A);
        reverseColumns(A);
        display(A);
    }

    public static void transpose(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A[0].length; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    public static void reverseColumns(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[0].length - 1 - j];
                A[i][A[0].length - 1 - j] = temp;
            }
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
