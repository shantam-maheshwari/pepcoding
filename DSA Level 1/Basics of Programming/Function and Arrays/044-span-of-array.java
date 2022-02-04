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
        int min = A[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        System.out.println(max - min);
    }
}