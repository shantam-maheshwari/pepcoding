import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && (j <= mid || j == n)) ||
                        (1 < i && i < mid && (j == mid || j == n)) ||
                        (i == mid) ||
                        (mid < i && i < n && (j == 1 || j == mid)) ||
                        (i == n && (j == 1 || j >= mid))) {
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