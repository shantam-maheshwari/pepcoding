import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        for (int beg = 0; beg < n; beg++) {
            for (int end = beg; end < n; end++) {
                for (int i = beg; i <= end; i++) {
                    System.out.print(a[i] + "\t");
                }
                System.out.println();
            }
        }
    }
}