import java.util.*;
import java.math.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number\n");
    int n=sc.nextInt();
    int x,sum=0;
    int digits=(int )(Math.log10(n)+1);

    if(digits%2==0) {
    	for(int i=0;i<digits/2;i++) {
    		x=n%10;
    		n=n/10;
    		sum=sum*10+x;
    	}
    	
    	//System.out.println("Even");
    }
    else {
    	for(int i=0;i<digits/2;i++) {
    		x=n%10;
    		n=n/10;
    		sum=sum*10+x;
    	}
    	n=n/10;
    	//System.out.println("Odd");
    }
//    System.out.println(sum);
//	System.out.println(n);
    if (sum==n) System.out.println("palindrome");
    else
    	System.out.println("non palindrome");
	}
	
}
