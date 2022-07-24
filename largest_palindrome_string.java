

//  lagrest palindrome in string 

import java.lang.*;
import java.io.*;
import java.util.*;

class Test {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t,n,i,k,j,wt=0,max=0;
		t=sc.nextInt();
		sc.nextLine();
		for(k=0;k<t;k++)
		{
		    String str1=sc.nextLine();
		    n=str1.length();

		    		String result=palindrome(0,n-1,str1);	    	
//		    }
//		    }
		    System.out.println(result);
		    }	      
	}
	public static String palindrome(int i,int j,String str1) {
		String result="";
		String c="";
		
		if(i>j) return "";
		else if(i==j) result+=str1.charAt(i);
		else if (str1.charAt(i)==str1.charAt(j)) {
			 c=check_palindrome(i,j,str1); 
			}
			String b=palindrome(i,j-1,str1);
			String a=palindrome(i+1,j,str1);
			
			if (c.length()>b.length() && c.length()>a.length()) return c;
			else if (b.length()>a.length()) return b;
			else  return a;
	}
	public static String check_palindrome(int i,int j,String str1) {
		
		int temp_i=i,temp_j=j;
	    while(i<=j) {
	    	if(str1.charAt(i)==str1.charAt(j)) {
	    		i++;j--;
	    	}
	    	else 
	    		 return "";
	    }
		str1=str1.substring(temp_i,temp_j+1);
		
		return str1;
	}
	
}