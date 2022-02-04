import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int valueInDestBase = getValueInBase(getValueIndecimal(n, sourceBase), destBase);
        System.out.println(valueInDestBase);
    }

    public static int getValueInBase(int n, int b) {
        int valueInBase = 0;
        int powerOf10 = 1;

        while (n != 0) {
            int rem = n % b;
            valueInBase += powerOf10 * rem;
            powerOf10 *= 10;
            n /= b;
        }
        return valueInBase;
    }

    public static int getValueIndecimal(int n, int b) {
        int valueInDecimal = 0;
        int powerOfBase = 1;

        while (n != 0) {
            int rem = n % 10;
            valueInDecimal += rem * powerOfBase;
            powerOfBase *= b;
            n /= 10;
        }
        return valueInDecimal;
    }
}