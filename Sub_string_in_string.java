
// Sub-string in a string

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: \n");
    String str=sc.nextLine(); 
    System.out.print("enter the Sub-String: \n");
    String sub_str=sc.nextLine();
    if(sub_str.length()==0) { System.out.println("Empty sub string"); System.exit(0);}
    int j=0,i=0;
    for(i=0;i<str.length();i++) {
    	if ( str.charAt(i)==sub_str.charAt(j)) {
    		j++;
    		for(int k=1;k<sub_str.length();k++) {
    			if ( str.charAt(i+k)!=sub_str.charAt(j)) { i=i+k;j=0; break; }
    			else {
    				j++;
    			}
    		}
    		if (j!=0) { System.out.print("Sub-String found at position: "+i); 
    		      break; }
    	}
    }
    if (i==str.length())System.out.println("Sub-string not found");
   }
}

