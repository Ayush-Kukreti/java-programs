
// String First letter capital after space 

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
    
    for( int i=1;i<=temp.length-2;i++) {
    	if(temp[i]==' ') {
    		temp[i+1]=(char)(temp[i+1]-32);
    	}
    }
    String str2=new String (temp);  // or String str2 = String.valueOf(temp);
    System.out.println(str2);
    }
}


