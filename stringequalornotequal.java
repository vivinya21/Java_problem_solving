import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class stringequalornotequal  {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.nextLine();
        String b = sc.next();
        boolean flag = false;
        char[] arr = a.toCharArray();
        char[] array = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(array);
        for(int i = 0;i<a.length();i++){
            if(arr[i] != array[i]){            
                flag = true;
                break;
            }
        } 
        if(flag == false){
           System.out.println("Equal"); 
        }
        else 
            System.out.println("Not Equal");
    }
}
