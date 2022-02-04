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

        int max = A[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, A[i]);
        }
        while (max > 0) {
            for (int i = 0; i < n; i++) {
                if (A[i] == max) {
                    System.out.print("*\t");
                    A[i]--;
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            max--;
        }
    }
}