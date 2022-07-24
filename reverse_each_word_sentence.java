// Reverse every word of sentence

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: \n");
    String str=sc.nextLine(); 
    int j=-1;
    String res="";
    char [] temp=str.toCharArray();
    
    for(int i=0;i<temp.length;i++) {
    	if(temp[i]!=' ') 	j++;
    	else {
    		for(int k=j;k>=0 && temp[k]!=' ' ;k--) {
    			res+=temp[k];
    		}
    		res+=" ";j++;
    	}	
    }
    for(int k=j;k>=0 && temp[k]!=' ' ;k--) {
		res+=temp[k];
	}
    
    //String str2=new String (temp);  // or String str2 = String.valueOf(temp);
    System.out.println(res);
    }
}