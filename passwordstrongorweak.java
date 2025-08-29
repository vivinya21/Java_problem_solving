import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class passwordstrongorweak {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            int n = password.length();
            int u = 0;
            int l = 0;
            int d = 0;
            int s = 0;
            if(n>=10){
            for(int i = 0;i<n;i++){
                    char ch = password.charAt(i);
                    if(ch>='A' && ch <= 'Z')
                            u = 1;
                    if(ch>='a' && ch <= 'z')
                            l = 1;
                    if(ch>='0' && ch <= '9')
                            d = 1;
                    else
                            s = 1;
                    
            }
            }
            if(u+l+d+s == 4){
                    System.out.println("Strong password");
            }
            else{
                    System.out.println("Weak password");
            }
    }
}
