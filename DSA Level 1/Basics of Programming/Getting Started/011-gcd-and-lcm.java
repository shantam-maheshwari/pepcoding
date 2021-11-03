import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int product = num1 * num2;

        // Euclid's algorithm
        int rem = num1 % num2;
        while (rem != 0) {
            num1 = num2;
            num2 = rem;
            rem = num1 % num2;
        }
        int gcd = num2;

        int lcm = product / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}