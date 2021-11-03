import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a * a + b * b + c * c;
        if (2 * max * max == sumOfSquares) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// Learnings:
// In pythagorean triplets, 2 * max * max == a*a + b*b + c*c