import java.util.*;

public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number\n");
    int n=sc.nextInt(); 
   
    int j;
    
    for(int i=0;i<n;i++) {
    	
	   for( j=0;j<n-i-1;j++) {
		System.out.print(" ");   
	   }
	   for(int k=0;k<=i;k++) {
			System.out.print("* ");   
		   }
	  System.out.println(); 
     }
	
    }
}
