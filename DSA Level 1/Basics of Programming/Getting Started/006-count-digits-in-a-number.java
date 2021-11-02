import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int digits = 0;
        while (n != 0) {
            digits++;
            n /= 10;
        }
        System.out.println(digits);
    }
}