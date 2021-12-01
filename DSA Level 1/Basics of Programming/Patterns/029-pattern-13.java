import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // C(i, j+1) = C(i, j) * (i-j)/(j+1)
        for (int i = 0; i < n; i++) {
            int C_ij = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(C_ij + "\t");
                C_ij = C_ij * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

// Learnings:
// use C(i, j+1) = C(i, j) * (i-j)/(j+1)
// not C(i, j) = C(i, j-1) * (i-j+1)/j