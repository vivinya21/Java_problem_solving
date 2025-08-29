import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class charisinuppercorlowerc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
                System.out.println("UPPERCASE"); 
            else
                     System.out.printf("LOWERCASE"); 
                    
    }
}
