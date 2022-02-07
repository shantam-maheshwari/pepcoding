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
        int s = scn.nextInt();
        int r = scn.nextInt();

        rotateRing(A, s, r);
        display(A);
    }

    public static void rotateRing(int[][] A, int s, int r) {
        int[] oneDim = getOneDim(A, s);
        rotateOneDim(oneDim, r);
        putOneDim(A, s, oneDim);
    }

    public static int[] getOneDim(int[][] A, int s) {
        int minrow = s - 1;
        int maxrow = A.length - s;
        int mincol = s - 1;
        int maxcol = A[0].length - s;

        int[] B = new int[2 * (maxrow - minrow + maxcol - mincol)];
        int idx = 0;
        while (idx != B.length) {
            // left wall
            for (int i = minrow; i <= maxrow; i++) {
                B[idx] = A[i][mincol];
                idx++;
            }
            mincol++;
            // bottom wall
            for (int j = mincol; j <= maxcol; j++) {
                B[idx] = A[maxrow][j];
                idx++;
            }
            maxrow--;
            // right wall
            for (int i = maxrow; i >= minrow; i--) {
                B[idx] = A[i][maxcol];
                idx++;
            }
            maxcol--;
            // top wall
            for (int j = maxcol; j >= mincol; j--) {
                B[idx] = A[minrow][j];
                idx++;
            }
            minrow++;
        }
        return B;
    }

    public static void rotateOneDim(int[] A, int r) {
        int n = A.length;
        r %= n;
        if (r < 0) {
            r += n;
        }
        reverseOneDim(A, 0, n - 1 - r);
        reverseOneDim(A, n - r, n - 1);
        reverseOneDim(A, 0, n - 1);
    }

    public static void reverseOneDim(int[] A, int left, int right) {
        int n = right - left + 1;
        for (int i = 0; i < n / 2; i++) {
            int temp = A[left + i];
            A[left + i] = A[left + n - 1 - i];
            A[left + n - 1 - i] = temp;
        }
    }

    public static void putOneDim(int[][] A, int s, int[] B) {
        int minrow = s - 1;
        int maxrow = A.length - s;
        int mincol = s - 1;
        int maxcol = A[0].length - s;

        int idx = 0;
        while (idx != B.length) {
            // left wall
            for (int i = minrow; i <= maxrow; i++) {
                A[i][mincol] = B[idx];
                idx++;
            }
            mincol++;
            // bottom wall
            for (int j = mincol; j <= maxcol; j++) {
                A[maxrow][j] = B[idx];
                idx++;
            }
            maxrow--;
            // right wall
            for (int i = maxrow; i >= minrow; i--) {
                A[i][maxcol] = B[idx];
                idx++;
            }
            maxcol--;
            // top wall
            for (int j = maxcol; j >= mincol; j--) {
                A[minrow][j] = B[idx];
                idx++;
            }
            minrow++;
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