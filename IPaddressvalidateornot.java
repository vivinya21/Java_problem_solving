import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class IPaddressvalidateornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String words[] = sentence.split("\\.");
        boolean flag = true;

        if (words.length == 4) { 
            for (int i = 0; i < words.length; i++) {
                String part = words[i];            
                if (!part.matches("\\d+")) {
                    flag = false;
                    break;
                }
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }

        if (flag) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

