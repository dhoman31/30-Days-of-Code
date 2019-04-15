import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String st = Integer.toBinaryString(n);
        int remainder=0, count1=0, count2=0;

        while(n > 0){
            remainder = n%2;
            n = n/2;
            
            if(remainder == 1){
                count1++;
                
                if(count1>=count2){
                    count2 = count1;
                }
            }
            else{
                count1 = 0;
            }
        }
        System.out.println(count2);
    }
}

