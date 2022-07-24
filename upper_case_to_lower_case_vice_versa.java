
// convert UPPER CASE TO LOWER CASE & VICE VERSA

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: \n");
    String str=sc.nextLine(); 
    int count=0;
    
    char [] temp=str.toCharArray();
    temp[0]=(char) (temp[0]-32);
    //System.out.println(temp[0]);
    
    for( int i=0;i<=temp.length-1;i++) {
    	if(temp[i] >=65 && temp[i] <=90) {
    		temp[i]=(char)(temp[i]+32); //System.out.println("hello");
    	}
    	else if(temp[i] >=97 && temp[i] <=122 )temp[i]=(char)(temp[i]-32);
    }
    String str2=new String (temp);  // or String str2 = String.valueOf(temp);
    System.out.println(str2);
    }
}


