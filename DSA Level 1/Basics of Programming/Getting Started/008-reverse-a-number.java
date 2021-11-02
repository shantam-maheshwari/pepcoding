import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int divisor = 10;
        while (n != 0) {
            int digit = n % divisor;
            System.out.println(digit);
            n /= 10;
        }
    }
}