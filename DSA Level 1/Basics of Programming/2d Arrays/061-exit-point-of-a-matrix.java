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

        int stepI = 0;
        int stepJ = 1;
        int i = 0, j = 0;
        while (0 <= i + stepI && i + stepI < n &&
                0 <= j + stepJ && j + stepJ < m) {
            i += stepI;
            j += stepJ;
            if (A[i][j] == 0) {
                continue;
            } else if (stepI == 0) {
                stepI = stepJ;
                stepJ = 0;
            } else {
                stepJ = -stepI;
                stepI = 0;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}