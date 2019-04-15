import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int Factorial(int a){
        // Positive or not
        if(a<0){
            System.out.println("Not valid number, enter positive number.");
            return 0;
        }
        else if(a==1){
            return 1;
        }
        else{
            return a*Factorial(a-1);
        }    
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Running nethod and printing
        System.out.println(Factorial(n));
        
    }
}

