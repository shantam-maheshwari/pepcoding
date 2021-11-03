import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int numberOfDigits = (int) Math.log10(n) + 1;
        k %= numberOfDigits;
        if (k < 0) {
            k += numberOfDigits;
        }

        // n = <head...><tail>
        for (int i = 0; i < k; i++) {
            int tail = n % 10;
            int head = n / 10;
            int multiplier = (int) Math.pow(10, numberOfDigits - 1);
            n = tail * multiplier + head;
        }
        System.out.println(n);
    }
}

// Learnings:
// left and right rotation can both be done using either one's implementation