package graphs;

import java.util.ArrayList;
import java.util.Scanner;

// the major difference is in the implementation of weighted and non-weighted graphs
// for the directed and un-directed graphs there is very minor change, that is add the given U,V entry for both the vertices U as well as for V in the array list. check line 36 and 37 for more clarity 

//this is boiler plate for directed/un-directed non-weighted graph 
public class BoilerPlateGraph {

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
		}
	}
}
