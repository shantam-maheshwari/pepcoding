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

        int powerOf2 = (int) Math.pow(2, n);
        for (int i = 0; i < powerOf2; i++) {
            String subset = "";
            int binary = i;
            for (int j = n - 1; j >= 0; j--) {
                if (binary % 2 == 0) {
                    subset = "-\t" + subset;
                } else {
                    subset = A[j] + "\t" + subset;
                }
                binary /= 2;
            }
            System.out.println(subset);
        }
    }
}

// Learnings:
// i % 2 indicates presence/absence of last element
// hence, inner loop is in reverse order
// and element is appended to beginning of subset