import java.io.*;
import java.util.*;

public class Main {

    public static String compression1(String str) {
        StringBuilder compressed = new StringBuilder();
        compressed.append(str.charAt(0));
        int idx = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (compressed.charAt(idx) != ch) {
                compressed.append(ch);
                idx++;
            }
        }
        return compressed.toString();
    }

    public static String compression2(String str) {
        StringBuilder compressed = new StringBuilder();
        char ch = str.charAt(0);
        int frequency = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            } else {
                compressed.append(ch);
                if (frequency > 1) {
                    compressed.append(frequency);
                }
                ch = str.charAt(i);
                frequency = 1;
            }
        }
        compressed.append(ch);
        if (frequency > 1) {
            compressed.append(frequency);
        }
        ch = str.charAt(str.length() - 1);
        frequency = 1;
        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}