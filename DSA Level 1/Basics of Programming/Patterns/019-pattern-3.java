import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        int leftSpace = n - 1;
        for (int i = 1; i <= n; i++, leftSpace--) {
            for (int j = 1; j <= leftSpace; j++) {
                pattern += "\t";
            }
            for (int j = 1; j <= n - leftSpace; j++) {
                pattern += "*\t";
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}