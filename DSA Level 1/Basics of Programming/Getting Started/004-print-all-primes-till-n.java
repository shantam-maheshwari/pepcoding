import java.util.*;

// Approach 1
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int number = low; number <= high; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}

// Approach 2: Sieve of Eratosthenes
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        boolean[] isComposite = new boolean[high + 1];
        for (int divisor = 2; divisor * divisor <= high; divisor++) {
            if (isComposite[divisor] == false) {
                for (int i = 2; i * divisor <= high; i++) {
                    isComposite[i * divisor] = true;
                }
            }
        }

        for (int i = low; i <= high; i++) {
            if (isComposite[i] == false) {
                System.out.println(i);
            }
        }
    }
}
