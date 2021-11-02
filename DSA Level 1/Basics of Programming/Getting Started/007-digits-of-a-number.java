import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int numberOfDigits = (int) Math.log10(n) + 1;
        int divisor = (int) Math.pow(10, numberOfDigits - 1);

        for (int i = 1; i <= numberOfDigits; i++) {
            int digit = n / divisor;
            System.out.println(digit);
            n %= divisor;
            divisor /= 10;
        }
    }
}

// Learnings:
// naive approach prints digits in reverse order
// numberOfDigits = log10(n) + 1