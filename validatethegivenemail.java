import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class validatethegivenemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        if (!email.contains("@")) {
            System.out.println("Invalid");
            return;
        }

        String[] parts = email.split("@");
        if (parts.length != 2) {
            System.out.println("Invalid");
            return;
        }

        String local = parts[0];
        String domain = parts[1];

        if (local.length() == 0 || domain.length() == 0) {
            System.out.println("Invalid");
            return;
        }

        if (!domain.contains(".")) {
            System.out.println("Invalid");
            return;
        }

        int dotIndex = domain.lastIndexOf('.');
        if (dotIndex == domain.length() - 1) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Valid");
    }
}
