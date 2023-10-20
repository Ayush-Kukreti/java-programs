package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Breadth First Search grid shortest path
// a adjacency matrix/grid
public class BFSGridShortestPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int T = sc.nextInt();

		while (T-- > 0) {
			System.out.println("Enter the number of rows in adjacency matrix/grid:");
			int row = sc.nextInt();
			System.out.println("Enter the number of colums in adjacency matrix/grid:");
			int col = sc.nextInt();

			// define a matrix[row][col]
			char matrix[][] = new char[row][col];

			System.out.println("enter element rows-wise:");

			// take input matrix
			for (int i = 0; i < row; i++) {
				//System.out.print("enter " + i + " row elements: ");
				for (int j = 0; j < col; j++)
					matrix[i][j] = sc.next().charAt(0);
				//System.out.println();
			}
			System.out.println(modifiedBfs(matrix)); 
		}
	}

	public static int modifiedBfs(char matrix[][]) {
		
		int row=matrix.length;
		int col=matrix[0].length;
		System.out.println(" matrix looks like....");
		// just to view the matrix
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++) System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		
		// find source
		int s_row=0,s_col=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]=='S') {
					s_row=i; s_col=j;
				}
			}
		}
		System.out.println(s_row);
		System.out.println(s_col);
		
		// define the possible movements
		// considering (top, right, bottom, left)
		// f(x,y): [ f(x-1,y), f(x,y+1), f(x+1,y), f(x,y-1) ]
		
		int possible_row[]= {-1,0,1,0};
		int possible_col[]= {0,1,0,-1};
		boolean visted[][]=new boolean[row][col];
		
		Queue<Integer> q1=new LinkedList<Integer>(); // insert row value
		Queue<Integer> q2=new LinkedList<Integer>(); // insert col value
		
		// add the source
		q1.add(s_row); q2.add(s_col);
		visted[s_row][s_col]=true;
		
		int path=0;
		
		while(!q1.isEmpty()) {
			path++;
			int size=q1.size();
			
			
			while(size >0) {
				int r=q1.poll(); int c=q2.poll();
				
				for(int i=0;i<possible_row.length;i++) {
					int rr=r+possible_row[i];
					int cc=c+possible_col[i];
					
					// check rr and cc valid or not
//					if(check(matrix,rr,cc))
					if(rr >= row || cc >= col || rr<0 || cc<0 || matrix[rr][cc] == '#') {}
					else {
						if(matrix[rr][cc]=='D') return path;
						if(!visted[rr][cc])
						 { visted[rr][cc]=true;q1.add(rr); q2.add(cc); }
					}
				}
				
				size--;
			}
		} 
		return -1;
	}
}
