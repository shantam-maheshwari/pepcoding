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
        int x = scn.nextInt();

        int row;
        int col;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (A[mid][0] > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        row = left;
        left = 0;
        right = n - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (A[row][mid] > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        col = left;
        if (A[row][col] == x) {
            System.out.println(row);
            System.out.println(col);
        } else {
            System.out.println("Not Found");
        }
    }
}