/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.function.*;




class GFG {
    
    static List<String> res= new ArrayList<>();
	public static void main (String[] args) {
	
    String input="abc";
	 
	helper(input,"");
    
    System.out.println(res);
	}
	
	public static void helper(String input, String output){
	    if(input.length()==0){
	        res.add(output); return ;
	    }
	    String op1=output + input.charAt(0);
	    //String op2=output + (char)( input.charAt(0) - 32); // 32 is the differnce b/w capital and small char
	    //String op2=output + input.substring(0,1).toUpperCase();
	     String op2=output +  Character.toUpperCase(input.charAt(0));
	    input=input.substring(1);
	    helper(input,op1);
	    helper(input,op2);
	}
	
}