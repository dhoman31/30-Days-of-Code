//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // HashMap for the values
        Map<String, Integer> namespace = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            in.nextLine();
            namespace.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(namespace.get(s)==null){
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + namespace.get(s));
            }
        }
        in.close();
    }
}


