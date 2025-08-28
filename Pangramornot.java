import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangramornot {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            int n = word.length();
            boolean flag = false;
            for(int i = 0;i<n;i++){
                    char ch = word.charAt(i);
                    if(Character.isUpperCase(ch)){
                            flag = true;
                            System.out.println("Pangrams");
                            break;
                    }
                 
            }
            if(flag == false){
                    System.out.println("Not Pangrams");
            }
    }
}
