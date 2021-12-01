import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            // \t
            // y = 2 - |3 - x|
            for (int j = 1; j <= (n - 1) / 2 - Math.abs((n + 1) / 2 - i); j++) {
                System.out.print("\t");
            }

            // *
            System.out.print("*\t");

            if (i != (n + 1) / 2) {
                // \t
                // y = 2 * |3 - x| - 1
                for (int j = 1; j <= 2 * Math.abs((n + 1) / 2 - i) - 1; j++) {
                    System.out.print("\t");
                }

                // *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}