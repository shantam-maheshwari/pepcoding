import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaceLength = 2 * n - 3;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + "\t");
            }
            for (int i = 1; i <= spaceLength; i++) {
                System.out.print("\t");
            }
            for (int i = row < n ? row : row - 1; i >= 1; i--) {
                System.out.print(i + "\t");
            }
            System.out.println();
            spaceLength -= 2;
        }
    }
}