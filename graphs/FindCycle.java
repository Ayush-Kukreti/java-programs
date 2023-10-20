package graphs;

import java.util.ArrayList;
import java.util.Scanner;

// to find cycle we use DFS 
// can we use BFS also for finding cycle ?

public class FindCycle {
	
//		int cur_traversal[]=new int[];
		boolean flag=false;
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
				
				findCycle(v, adj);
			}
	}
		
		public static void findCycle(int V, ArrayList<ArrayList<Integer>> adj) {
			
			boolean cur_traversal[]=new boolean[V];
			boolean visted[]=new boolean[V];
			int parent[]=new int[V];
			for(int i=0;i<V;i++) {
				if(!visted[i]) {
					
					if(modifiedDfs(i,adj,cur_traversal,visted,parent)) {
						System.out.println("cycle exists ");
						break;
					}
//					boolean cycle=modifiedDfs(i,adj,cur_traversal,visted,parent);
//					 System.out.println(cycle);
//					 System.out.println(i);
				}
			}
			for(boolean x: visted) System.out.print(x+" ");
		}
		
		public static boolean modifiedDfs(int i,ArrayList<ArrayList<Integer>> adj,
				boolean cur_traversal[], boolean visted[],int parent[]) {
			
//			if(visted[i]==true) return false;
			visted[i]=true;
			cur_traversal[i]=true;
			
			for(int x: adj.get(i)) {
//				System.out.println("x:"+x);
				if(!visted[x]) {
//					System.out.println("visted x:"+x);
					parent[x]=i;
					if( modifiedDfs(x,adj,cur_traversal,visted,parent))
						return true;
				}
				else {
					if(cur_traversal[x]==true && parent[i]!=x ) {
//						System.out.println("x:"+x);
//						System.out.println("i:"+i);
//						System.out.println("parent[i]:"+parent[i]);
						return true;
						
					}
				}
			}
			cur_traversal[i]=false;
			return false;
		}
}
