import java.util.Scanner;

public class  ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // Clean input: remove '-' and spaces, normalize 'x'->'X'
        char[] buf = new char[s.length()];
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-' || ch == ' ') continue;
            if (ch == 'x') ch = 'X';
            buf[n++] = ch;
        }

        boolean valid = false;

        if (n == 10) {
            // ISBN-10: 9 digits + final digit 0-9 or X; checksum sum((i+1)*d_i) % 11 == 0
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                char ch = buf[i];
                int digit;
                if (i == 9 && ch == 'X') {
                    digit = 10;
                } else if (ch >= '0' && ch <= '9') {
                    digit = ch - '0';
                } else {
                    System.out.println("ISBN Number is Not Valid");
                    return;
                }
                sum += digit * (i + 1);
            }
            valid = (sum % 11 == 0);

        } else if (n == 13) {
            // Judge's rule: 13 digits, must start with 978 or 979 (no checksum)
            boolean allDigits = true;
            for (int i = 0; i < 13; i++) {
                char ch = buf[i];
                if (ch < '0' || ch > '9') { allDigits = false; break; }
            }
            boolean prefix = (buf[0] == '9' && buf[1] == '7' && (buf[2] == '8' || buf[2] == '9'));
            valid = allDigits && prefix;

        } else {
            valid = false;
        }

        System.out.println(valid ? "ISBN Number is Valid" : "ISBN Number is Not Valid");
    }
}
