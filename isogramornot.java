import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class isogramornot {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            int n = word.length();
            int count = 0;
            for(int i = 0 ;i<n;i++){
                    char ch = word.charAt(i);
                      for (int j = i + 1; j < n; j++) {
                            char ch1 = word.charAt(j);
                            if(ch == ch1){
                                    count++;
                                    break;
                            }
                    } 
            }
            if (count == 0){
                    System.out.println("ISOGRAM");
            }
            else{
                    System.out.println("NOT ISOGRAM");
            }
    }
}
