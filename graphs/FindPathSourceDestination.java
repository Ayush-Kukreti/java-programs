package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


// we have to find shortest path from source to destination
public class FindPathSourceDestination {
	
	
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
			System.out.println("enter the source node:");
			int s=sc.nextInt();
			
			System.out.println("enter the destination node:");
			int d=sc.nextInt();
			System.out.println(adj);
			modifiedbfsTraversal(v, adj,s,d);
		}
	}
	
	public static void modifiedbfsTraversal(int V, ArrayList<ArrayList<Integer>> adj,int s,int d) {
		boolean visted[]=new boolean[V];
		int parent[]=new int[V];
		Arrays.fill(parent, -1);
		
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(s);
		visted[s]=true;
		
		while(!q.isEmpty()) {
			int num=q.poll();
			
			for(int x: adj.get(num)) {
				if(!visted[x]) {
					q.add(x); visted[x]=true; parent[x]=num;
				}
			}
		}
		ArrayList<Integer> path=new ArrayList<Integer>();
		for(int i=d;i>=0;i=parent[i]) {
			if(i==-1) break;
			path.add(i);
		}
		
		if( path.get(path.size()-1)==s )  
		Collections.reverse(path);
		else
			System.out.println("no path is there....");
		
		System.out.println("path is: "+path);
	}
}
