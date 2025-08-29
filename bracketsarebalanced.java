import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bracketsarebalanced  {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            int n = word.length();
            int count = 0;
            boolean balanced = true;
            for(int i = 0;i<n;i++){
                    char ch = word.charAt(i);
                    if(ch == '('){
                            count++;
                    }
                    else if(ch == ')'){
                            count--;
                    
                    if (count < 0) { 
                    balanced = false;
                    break;
                }
            }
    }
             if (balanced && count == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
            
}
}
