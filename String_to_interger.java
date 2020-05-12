
// string to integer 

import java.util.*;
public class Test
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a String: \n");
    String str=sc.nextLine(); 
    int j=-1;
   int flag=0;
    //char [] temp=str.toCharArray();
    int integer=0,check=0;
	if(str.length() >10 ) {
		System.out.println("value greater than maximum integer");flag=1; 
		// max int 2,147,483,647
	}
	
	else if(str.length()==10){
			for(int i=0;i<9;i++){
				integer=integer*10+str.charAt(i)-'0';
			}
			//System.out.println(integer);
			if(integer < 214748364) {
				integer=integer*10+str.charAt(9)-'0';
			}
			else if (integer > 214748364) {
				System.out.println("value greater than maximum integer X");flag=1;
			}
			else {
				if(str.charAt(9)-'0'<= 7 ) integer=integer*10+str.charAt(9)-'0';
				else {
					System.out.println("value greater than maximum integer Y");flag=1;
				}
			}
		}
	
	else {
			for(int i=0;i<str.length();i++){
				integer=integer*10+str.charAt(i)-'0';
			}
			
		}
	if (flag==0) 
		System.out.println(integer);
    }
}


