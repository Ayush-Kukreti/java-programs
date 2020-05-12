import java.util.*;
import java.math.*;



public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a binary number\n");
    int n=sc.nextInt(); 
    Decimal_to_Binary(n);
	}
	public static void Decimal_to_Binary(int n) {
	    	if(n>0) {
		    int x=n%2;
	    	Decimal_to_Binary(n/2);
	    	System.out.print(x);
	    	}
	}
	
}
// for decimal to octal replace 2 by 8
// for decimal to hexadecimal replace 2 by 16......and some other modification for A,B,C,D,E,F