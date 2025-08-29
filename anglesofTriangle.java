import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class anglesofTriangle {

    public static void main(String[] args) {
           int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a+b+c;
            if(sum == 180){
                    System.out.println("Valid");
            }
            else{
                    System.out.println("Not Valid");
            }
    }
}
