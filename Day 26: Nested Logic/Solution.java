import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int returnDay = sc.nextInt();
        int returnMonth = sc.nextInt();
        int returnYear = sc.nextInt();

        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();

        sc.close();

        int fine;

        if(returnYear-expectedYear>0){
            fine = 10000;
        } else if(returnMonth-expectedMonth>0 && returnYear-expectedYear==0){
            fine = 500*(returnMonth-expectedMonth);
        } else if(returnDay-expectedDay>0 && returnYear-expectedYear==0){
            fine = 15*(returnDay-expectedDay);
        } else {
            fine = 0;
        }

        System.out.println(fine);

    }
}


