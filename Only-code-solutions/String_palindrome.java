
// Palindrome

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: \n");
    String str=sc.nextLine(); 
    int i=0,j=str.length()-1,flag=0;
    while(i<=j) {
    	if(str.charAt(i)==str.charAt(j)) {
    		i++;j--;
    	}
    	else {
    		System.out.println("Not Palindrome"); flag=1; break;
    	}
    }
    if(flag==0) System.out.println("Palindrome");
   
    
	}
}
