import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root){
        // store nodes and node data
        ArrayList<Node> list = new ArrayList<Node>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        
        // add the root node
        if(root!=null){
            list.add(root);
            values.add(root.data);
        }
          
        // while list not empty check left and right trees, search these nodes in order
        while(!list.isEmpty()){
            Node x = list.get(0);
            if(x.left!=null){
                list.add(x.left);
                values.add(x.left.data);
            }
            if(x.right!=null){
                list.add(x.right);
                values.add(x.right.data);
            }
            // print the values
            System.out.print(list.get(0).data + " ");
            // remove first list element to allow loop to terminate
            list.remove(0);
        }
      
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
