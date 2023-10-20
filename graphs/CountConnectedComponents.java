package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class CountConnectedComponents {
	
	static int count=0;
	
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
			countComponents(v,adj);
		}
  }
	public static void countComponents(int V,ArrayList<ArrayList<Integer>> adj) {
		
		boolean visted[]=new boolean[V];
		
		for(int i=0;i<V;i++) {
			if( !visted[i] ) {
				helper(i,adj,visted); count++;
				System.out.println("vertex: "+i);
				System.out.println("count: "+count);
				
			}
				
		}
		System.out.println("count: "+count);
	}
	public static void helper(int i,ArrayList<ArrayList<Integer>> adj,boolean visted[]) {
		
		if(visted[i]==true) return ;
		visted[i]=true;
		
		for(int x: adj.get(i)) {
//			System.out.println(x);
			helper(x,adj,visted);
		}
	}
}
