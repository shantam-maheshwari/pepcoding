import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        // upper half
        int starLength = n / 2 + 1;
        int spaceLength = 1;
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= starLength; j++) {
                pattern += "*\t";
            }
            for (int j = 1; j <= spaceLength; j++) {
                pattern += "\t";
            }
            for (int j = 1; j <= starLength; j++) {
                pattern += "*\t";
            }
            pattern += "\n";
            starLength--;
            spaceLength += 2;
        }
        // lower half
        starLength = 2;
        spaceLength = n - 2;
        for (int i = n / 2 + 2; i <= n; i++) {
            for (int j = 1; j <= starLength; j++) {
                pattern += "*\t";
            }
            for (int j = 1; j <= spaceLength; j++) {
                pattern += "\t";
            }
            for (int j = 1; j <= starLength; j++) {
                pattern += "*\t";
            }
            pattern += "\n";
            starLength++;
            spaceLength -= 2;
        }
        System.out.println(pattern);
    }
}