import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        int leftSpaceLength = n / 2;
        int numbersLength = 1;
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= leftSpaceLength; j++) {
                pattern += "\t";
            }
            int number = i;
            for (int j = 1; j <= numbersLength; j++) {
                pattern += number + "\t";
                if (j <= numbersLength / 2) {
                    number++;
                } else {
                    number--;
                }
            }
            pattern += "\n";
            if (row <= n / 2) {
                leftSpaceLength--;
                numbersLength += 2;
                i++;
            } else {
                leftSpaceLength++;
                numbersLength -= 2;
                i--;
            }
        }
        System.out.println(pattern);
    }
}