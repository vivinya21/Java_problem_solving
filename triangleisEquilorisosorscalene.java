import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class triangleisEquilorisosorscalene  {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b && b==c){
                    System.out.println("Equilateral");
            }
            else if(a==b || b == c || a== c){
                    System.out.println("Isosceles");
            }
            else{
                    System.out.println("Scalene");
            }
    }
}
