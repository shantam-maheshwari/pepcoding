import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    pattern += "*\t";
                } else {
                    pattern += "\t";
                }
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}