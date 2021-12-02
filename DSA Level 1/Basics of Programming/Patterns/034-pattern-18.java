import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaceLength = 0;
        int starLength = n;

        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= spaceLength; i++) {
                System.out.print("\t");
            }

            for (int i = 1; i <= starLength; i++) {
                if (1 < row && row <= n / 2 && 1 < i && i < starLength) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            System.out.println();
            if (row <= n / 2) {
                spaceLength++;
                starLength -= 2;
            } else {
                spaceLength--;
                starLength += 2;
            }
        }
    }
}