import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        int leftSpaceLength = n / 2;
        int middleSpaceLength = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= leftSpaceLength; j++) {
                pattern += "\t";
            }
            if (!(i == 1 || i == n)) {
                pattern += "*\t";
                for (int j = 1; j <= middleSpaceLength; j++) {
                    pattern += "\t";
                }
            }
            pattern += "*\n";
            if (i <= n / 2) {
                leftSpaceLength--;
                middleSpaceLength += 2;
            } else {
                leftSpaceLength++;
                middleSpaceLength -= 2;
            }
        }
        System.out.println(pattern);
    }
}