
// Panagram

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number\n");
    String str=sc.nextLine(); 
    int []alpha=new int[26];
    int count,flag=0;
    char ch;
    String st=str.replaceAll("\\s+", "");
    for(int i=0;i<st.length();i++) {
    	count=st.charAt(i)-97;
    	alpha[count]=1;
    }
    for(int i=0;i<26;i++) {
    	if (alpha[i]!=1) { System.out.println("Not panagram"); 
    	 flag=1;break;
    	}
    }
    	if(flag==0) System.out.println("Is panagram");
   
    
	}
}
//NOTE try to use user defined function to remove spaces 