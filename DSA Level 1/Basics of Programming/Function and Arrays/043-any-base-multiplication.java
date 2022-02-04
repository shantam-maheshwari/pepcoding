import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int sum = 0;
        int powerOf10 = 1;
        while (n2 != 0) {
            int digit = n2 % 10;
            n2 /= 10;
            int productWithSingleDigit = getProductWithSingleDigit(b, n1, digit);
            sum = getSum(b, sum, productWithSingleDigit * powerOf10);
            powerOf10 *= 10;
        }
        return sum;
    }

    public static int getProductWithSingleDigit(int b, int n1, int d) {
        int product = 0;
        int p;
        int c = 0;
        int powerOf10 = 1;
        while (n1 != 0 || c != 0) {
            int digit = n1 == 0 ? 0 : n1 % 10;
            n1 /= 10;
            p = (digit * d + c) % b;
            c = (digit * d + c) / b;
            product += p * powerOf10;
            powerOf10 *= 10;
        }
        return product;
    }

    public static int getSum(int b, int n1, int n2) {
        int sum = 0;
        int s;
        int c = 0;
        int powerOf10 = 1;
        while (n1 != 0 || n2 != 0 || c != 0) {
            int d1 = n1 == 0 ? 0 : n1 % 10;
            n1 /= 10;
            int d2 = n2 == 0 ? 0 : n2 % 10;
            n2 /= 10;
            s = (d1 + d2 + c) % b;
            c = (d1 + d2 + c) / b;
            sum += s * powerOf10;
            powerOf10 *= 10;
        }
        return sum;
    }
}

// Learnings:
// while adding products of n1 with digits of n2,
// make sure to shift the products by one position