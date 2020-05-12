
// Daimond Shape

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number\n");
    int n=sc.nextInt(); 
    
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n-i-1;j++) {
    			System.out.print(" ");
    	}
    	for(int k=0;k<=2*i;k++) {
			System.out.print("*");
    	}
    System.out.println();
    }
    n=n-2;
    for(int i=n;i>=0;i--) {
    	for(int j=0;j<=n-i;j++) {
    			System.out.print(" ");
    	}
    	for(int k=0;k<=2*i;k++) {
			System.out.print("*");
    	}
    System.out.println();
    }
    
	}
}


//// to make a hallow diamond use following:
/* 
for(int k=0;k<=2*i;k++) {
    		if(k==0 || k==2*i ) System.out.print("*");
			else
				System.out.print(" ");
    	}
*/
