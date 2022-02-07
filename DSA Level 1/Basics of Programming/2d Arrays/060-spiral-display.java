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
        int count = 0;
        int minrow = 0;
        int maxrow = A.length - 1;
        int mincol = 0;
        int maxcol = A[0].length - 1;
        while (count < n * m) {
            // left wall
            for (int i = minrow; i <= maxrow && count < n * m; i++) {
                System.out.println(A[i][mincol]);
                count++;
            }
            mincol++;
            // botton wall
            for (int j = mincol; j <= maxcol && count < n * m; j++) {
                System.out.println(A[maxrow][j]);
                count++;
            }
            maxrow--;
            // right wall
            for (int i = maxrow; i >= minrow && count < n * m; i--) {
                System.out.println(A[i][maxcol]);
                count++;
            }
            maxcol--;
            // top wall
            for (int j = maxcol; j >= mincol && count < n * m; j--) {
                System.out.println(A[minrow][j]);
                count++;
            }
            minrow++;
        }
    }
}