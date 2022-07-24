
// Daimond Shape
import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number\n");
    int n=sc.nextInt(); 
    
    for(int i=1;i<n;i++) {
    	for(int j=1;j<=n-i-1;j++) {
    			System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++) {
		 System.out.print(k);
    	}
    	for(int k=i-1;k>0;k--) {
   		 System.out.print(k);
       	}
    System.out.println();
    }
    n=n-2;
    for(int i=n;i>=1;i--) {
    	for(int j=1;j<=n-i+1;j++) {
    			System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++) {
   		 System.out.print(k);
       	}
       	for(int k=i-1;k>0;k--) {
      		 System.out.print(k);
          	}
    System.out.println();
    }
    
	}
}
