package graphs;

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * the major difference is in the implementation of weighted and non-weighted graphs only.
for the directed and un-directed graphs there is very minor change,
that is add the given U,V entry for both the vertices U as well as for V in the array list. 
 * */

//this is boiler plate for directed/un-directed weighted graph 

public class BoilerPateWeightedGraph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int T=sc.nextInt();
		
		while(T-- > 0) {
			System.out.println("Enter the number of vertices:");
			int v=sc.nextInt();
			System.out.println("Enter the number of edges:");
			int e=sc.nextInt();
			
			ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<ArrayList<ArrayList<Integer>>>(v);
			
			// creating arraylist of arralist for every vertex.
			for(int i=0;i<v;i++) {
				adj.add(i,new ArrayList< ArrayList<Integer>>()); 
				
				// we can use the below representation also since it will start adding from index 0.
				//adj.add(new ArrayList< ArrayList<Integer>>());
			}
			System.out.println("Enter the edges in the U V W format:");
			
			for(int i=0;i<e;i++) {
				int U=sc.nextInt();
				int V=sc.nextInt();
				int W=sc.nextInt();
				
				// for directed graph 
				ArrayList<Integer> l1=new ArrayList<Integer>();
				l1.add(V); l1.add(W);
				adj.get(U).add(l1);
				
				//in case graph is undirected 
				ArrayList<Integer> l2=new ArrayList<Integer>();
				l2.add(U); l2.add(W);
				adj.get(V).add(l2);
			}
			System.out.println(adj);
		}
		
	}
}
