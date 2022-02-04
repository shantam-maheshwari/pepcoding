import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int n3 = Math.max(n1, n2) + 1; // one extra for carry
        int sum[] = new int[n3];
        int carry = 0;
        int i1 = n1 - 1;
        int i2 = n2 - 1;
        int i3 = n3 - 1;
        while (i3 >= 0) {
            int d1 = i1 >= 0 ? a1[i1--] : 0;
            int d2 = i2 >= 0 ? a2[i2--] : 0;
            int s = d1 + d2 + carry;
            sum[i3] = s % 10;
            carry = s / 10;
            i3--;
        }

        if (sum[0] == 1) {
            System.out.println(sum[0]);
        }
        for (int i = 1; i < n3; i++) {
            System.out.println(sum[i]);
        }
    }
}

// Learnings:
// third array needed because of potential carry