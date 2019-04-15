import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	String[] st = new String[x];

      	for(int i = 0; i<x; i++){
      		st[i] = sc.next();
      	}

      	for(int j = 0; j<x; j++){
      		for(int k = 0; k<st[j].length(); k=k+2){
      			System.out.print(st[j].charAt(k));
      		}
      		System.out.print(" ");

			for(int k = 1; k<st[j].length(); k=k+2){
				System.out.print(st[j].charAt(k));
			}
			System.out.println();
      	}
    }
}

