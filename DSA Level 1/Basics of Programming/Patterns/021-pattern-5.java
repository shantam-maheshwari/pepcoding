import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        // upper half
        int leftSpaceLength = n / 2;
        int starLength = 1;
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= leftSpaceLength; j++) {
                pattern += "\t";
            }
            for (int j = 1; j <= starLength; j++) {
                pattern += "*\t";
            }
            pattern += "\n";
            leftSpaceLength--;
            starLength += 2;
        }
        // lower half
        leftSpaceLength = 1;
        starLength = n - 2;
        for (int i = n / 2 + 2; i <= n + 1; i++) {
            for (int j = 1; j <= leftSpaceLength; j++) {
                pattern += "\t";
            }
            for (int j = 1; j <= starLength; j++) {
                pattern += "*\t";
            }
            pattern += "\n";
            leftSpaceLength++;
            starLength -= 2;
        }
        System.out.println(pattern);
    }
}