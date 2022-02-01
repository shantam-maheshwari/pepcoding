import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int product = num1 * num2;

        // Euclid's algorithm
        while (num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num1;

        int lcm = product / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}