import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaceLength = n / 2;
        int starLength = 1;

        for (int row = 1; row <= n; row++) {
            if (row != n / 2 + 1) {
                for (int i = 1; i <= spaceLength; i++) {
                    System.out.print("\t");
                }
            } else {
                for (int i = 1; i <= spaceLength; i++) {
                    System.out.print("*\t");
                }
            }

            for (int i = 1; i <= starLength; i++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (row <= n / 2) {
                starLength++;
            } else {
                starLength--;
            }
        }

    }
}