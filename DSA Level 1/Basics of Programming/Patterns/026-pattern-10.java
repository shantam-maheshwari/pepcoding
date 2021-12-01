import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // outerSpace = 2 1 0 1 2
        // innerSpace = -1 1 3 1 -1
        int outerSpace = n / 2;
        int innerSpace = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            if (1 < i && i < n) {
                for (int j = 1; j <= innerSpace; j++) {
                    System.out.print("\t");
                }
                System.out.print("*");
            }

            if (i <= n / 2) {
                outerSpace--;
                innerSpace += 2;
            } else {
                outerSpace++;
                innerSpace -= 2;
            }
            System.out.println();
        }

    }
}