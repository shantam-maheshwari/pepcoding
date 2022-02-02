import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = "";
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                pattern += number + "\t";
                number++;
            }
            pattern += "\n";
        }
        System.out.println(pattern);
    }
}