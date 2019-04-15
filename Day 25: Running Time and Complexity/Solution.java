import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPrime(int n){
        //int sq = (int)Math.sqrt(n);
        
        if(n == 1){
            return false;
        }

        if(n == 2){
            return true;
        }

        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        // stdin
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int ar[] = new int[len];
        
        // fill the array
        for(int i=0; i<len; i++){
            ar[i] = sc.nextInt();
        }

        // determine if prime
        for(int x: ar){
            System.out.println((isPrime(x)) ? "Prime" : "Not prime");
        }

    }
}




