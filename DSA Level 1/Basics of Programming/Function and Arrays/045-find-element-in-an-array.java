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
        int d = scn.nextInt();

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (d == A[i]) {
                idx = i;
            }
        }
        System.out.println(idx);
    }
}