// String Reverse 

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: \n");
    String str=sc.nextLine(); 
    int i=str.length()-1,flag=0;
    String reverse_str="";
    
    while(i>=0) {
    	reverse_str+=str.charAt(i); i--;
    }
    System.out.println(reverse_str);
    
	}
}
