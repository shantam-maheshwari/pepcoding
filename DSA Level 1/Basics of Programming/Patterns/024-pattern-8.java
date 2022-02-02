import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        int spaceLength = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaceLength; j++) {
                pattern += "\t";
            }
            pattern += "*\n";
            spaceLength--;
        }
        System.out.println(pattern);
    }
}