import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j <= mid || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i < mid) {
                    if (j == mid || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i == mid) {
                    System.out.print("*\t");
                } else if (i < n) {
                    if (j == 1 || j == mid) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else { // i == n
                    if (j == 1 || j >= mid) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}