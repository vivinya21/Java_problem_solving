import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class characVowelorConsonant  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
                System.out.println("Vowel"); 
            else
                    System.out.printf("Consonant");   
    }
}
