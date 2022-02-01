import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            boolean isPrime = true;

            if (n == 1) {
                isPrime = false;
            } else if (n == 2) {
                // isPrime = true;
            } else if (n % 2 == 0) {
                isPrime = false;
            } else {
                for (int divisor = 2; divisor * divisor <= n; divisor += 2) {
                    if (n % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}

// Learnings:
// use divisor * divisor <= n instead of divisor <= Math.sqrt(n)
// if n > 2 and n not even, then only check odd factors