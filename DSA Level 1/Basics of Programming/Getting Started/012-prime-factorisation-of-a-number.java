import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            while (n % divisor == 0) {
                System.out.print(divisor + " ");
                n /= divisor;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}

// Learnings:
// no need to check or generate primes upto sqrt(n)
// if n != 1 afterwards, n itself is prime