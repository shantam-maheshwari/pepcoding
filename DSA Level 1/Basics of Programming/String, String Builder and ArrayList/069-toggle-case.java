import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        str = toggleCase(str);
        System.out.println(str);
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch ^= 32;
            sb.append(ch);
        }
        return sb.toString();
    }
}