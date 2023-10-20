package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


// node is class for tree 

class Node{
	int data;
	Node left;
	Node right;
	
}
public class LevelOrderTraversalBinaryTree {

	static void levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> q=new LinkedList<Node>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
       
        ArrayList<Integer> list=new ArrayList<Integer>();
        q.add(node); 
        // Node temp1=q.poll();
        // System.out.println(temp1.data);
        while( !q.isEmpty() ){
            Node temp=q.poll();
            System.out.println(temp.data);
            if(temp.left !=null ) q.add(temp.left); 
            if(temp.right !=null) q.add(temp.right);
        }
        System.out.println(list);
       // return res;
    }
}
