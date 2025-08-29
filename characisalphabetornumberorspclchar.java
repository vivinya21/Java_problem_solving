import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class characisalphabetornumberorspclchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch))
                System.out.println("ALPHABET"); 
            else if(Character.isDigit(ch))
                    System.out.printf("NUMBER");  
            else
                     System.out.printf("SPECIAL CHARACTER"); 
                    
    }
}
