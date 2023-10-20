package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	
	static Queue<Integer> q=new LinkedList<Integer>();
	
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
			bfsTraversal(v, adj);
		}
	}

	public static void bfsTraversal(int V, ArrayList<ArrayList<Integer>> adj) {
		
		boolean visted[]=new boolean[V];
		
		// we can use below, if we are sure the graph has only 1 connected component or 
		// graph is connected
		//q.add(0);
		
		// this is to make sure even if the graph contains connected components 
		// we are still traversing all the nodes
		for(int i=0;i<V;i++) {
			if(!visted[i]) {
				q.add(i);
				visted[i]=true;
				
				while(!q.isEmpty()) {
					int num=q.poll();
					
					System.out.print(num+"->");
					
					for(int x: adj.get(num)) {
						if(!visted[x]) {
							q.add(x);
							visted[x]=true;
						}
					}
				}
				System.out.println("N");
			}
		}
		
	}

}
