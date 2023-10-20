package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int T=sc.nextInt();
		
		while(T-- > 0) {
			System.out.println("Enter the number of vertices:");
			int v=sc.nextInt();
			System.out.println("Enter the number of edges:");
			int e=sc.nextInt();
			
			// storing the graph in array list data structure
			ArrayList< ArrayList<Integer> > adj=new ArrayList< ArrayList<Integer> >(v);
			
			// for every vertex create a Array list for it.
			for(int i=0;i<v;i++) adj.add(new ArrayList<Integer>());
		
			System.out.println("Enter the edges in the U V format:");
			
			for(int i=0;i<e;i++) {
				int U=sc.nextInt();
				int V=sc.nextInt();
				adj.get(U).add(V);
				
				// ENABLE THIS IF THE GRAPH IS UN-DIRECTED
				 adj.get(V).add(U);   
			}
			System.out.println(adj);
			dfsTraversal(v, adj);
		}
	}

	public static void  dfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
		boolean visted[]=new boolean[V];
		
		// this is to make sure even if the graph contains connected components 
		// we are still traversing all the nodes
		for(int i=0;i<V;i++) {
			if(!visted[i]) {
				helper(i,adj,visted);
				System.out.println("N"); // so that every separate component comes at different line
			}
		}
		
		// we can use below, if we are sure the graph has only 1 connected component or 
		// graph is connected
		// helper(0,adj,visted); 
		
		
	}
	public static void helper(int i, ArrayList<ArrayList<Integer>> adj,boolean []visted) {
		
		if(visted[i]) return ;
		System.out.print(i+"->"); // or else add it to a list
		
		visted[i]=true;
		
		for(int x: adj.get(i))		
			helper(x,adj,visted);
	}
}
