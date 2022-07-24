import java.util.*;
import java.math.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a binary number\n");
    int n=sc.nextInt();
    int lastDigit,i=0,sum=0;
    while(n>0) {
    	lastDigit=n%10;
    	if(lastDigit==1) {sum+=(int)Math.pow(2,i);i++; }
    	else i++;
    	n=n/10;
    }
    System.out.println(sum);
    
    
	}
}
