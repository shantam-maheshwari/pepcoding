import java.io.*;
import java.util.*;

public class Main {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char c1 = str.charAt(0);
        sb.append(c1);
        for (int i = 1; i < str.length(); i++) {
            char c2 = str.charAt(i);
            sb.append(c2 - c1);
            sb.append(c2);
            c1 = c2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}