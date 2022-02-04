import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int borrow = 0;
        int i2 = n2 - 1;
        int i1 = n1 - 1;
        while (i1 >= 0 || borrow != 0) {
            int d1 = i1 >= 0 ? a1[i1] : 0;
            a2[i2] -= d1 + borrow;
            if (a2[i2] < 0) {
                a2[i2] += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            i2--;
            i1--;
        }
        {
            int i;
            for (i = 0; i < n2 && a2[i] == 0; i++)
                ;
            for (; i < n2; i++) {
                System.out.println(a2[i]);
            }
        }
    }
}

// Learnings:
// difference between two positive numbers <= max(num1, num2)
// hence, no need to create a third array