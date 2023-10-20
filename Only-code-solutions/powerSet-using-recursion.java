/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		String str="abcderfguyhfghfg";
		powerSet(str,"");
	}
	public static void powerSet(String input,String output){
	    
	    if(input.length()==0 ) {
	        System.out.println(output);
	        return ;
	    }
	    
	    String out1= output;
	    String out2=output+input.charAt(0);
	    
	    input=input.substring(1);
	    
	    powerSet(input,out1);
	    powerSet(input,out2);
	}
}