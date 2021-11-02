import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            boolean isPrime = true;
            for (int divisor = 2; divisor * divisor <= n; divisor++) {
                if (n % divisor == 0) {
                    isPrime = false;
                    break;
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