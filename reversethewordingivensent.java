import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class reversethewordingivensent {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            String words[] = sentence.split(" ");
            for(int i=words.length-1;i>=0;i--)
            {
                    System.out.print(words[i]+" ");
                    
            }
    }
}
