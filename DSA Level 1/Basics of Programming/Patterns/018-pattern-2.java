import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                pattern += "*\t";
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}