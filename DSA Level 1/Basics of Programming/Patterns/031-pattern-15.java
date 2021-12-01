import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int spaceLength = (n - 1) / 2;
        int rowVal = 1;
        for (int rowNum = 1; rowNum <= n; rowNum++) {
            for (int i = 1; i <= spaceLength; i++) {
                System.out.print("\t");
            }

            int colVal = rowVal;
            for (int colNum = 1; colNum <= 2 * rowVal - 1; colNum++) {
                System.out.print(colVal + "\t");
                if (colNum < rowVal) {
                    colVal++;
                } else {
                    colVal--;
                }
            }
            System.out.println();

            if (rowNum <= (n - 1) / 2) {
                spaceLength--;
                rowVal++;
            } else {
                spaceLength++;
                rowVal--;
            }
        }
    }
}