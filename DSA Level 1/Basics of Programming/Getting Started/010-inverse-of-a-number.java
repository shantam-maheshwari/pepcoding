import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int numberOfDigits = (int) Math.log10(n) + 1;
        int inverse = 0;
        for (int pos = 1; pos <= numberOfDigits; pos++) {
            int digit = n % 10;
            inverse += pos * Math.pow(10, digit - 1);
            n /= 10;
        }
        System.out.println(inverse);
    }
}