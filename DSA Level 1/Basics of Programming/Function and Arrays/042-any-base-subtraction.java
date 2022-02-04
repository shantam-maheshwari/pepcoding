import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n2, n1);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int difference = 0;
        int d = 0;
        int borrow = 0;
        int powerOf10 = 1;
        while (n1 != 0) {
            int d1 = n1 % 10;
            n1 /= 10;
            int d2 = n2 == 0 ? 0 : n2 % 10;
            n2 /= 10;
            d = (d1 - d2 - borrow);
            if (d < 0) {
                d += b;
                borrow = 1;
            } else {
                borrow = 0;
            }
            difference += d * powerOf10;
            powerOf10 *= 10;
        }
        return difference;
    }
}