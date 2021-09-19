/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class business
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n;
	    Scanner sc=new Scanner(System.in);  

	
		
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(" enter the limit for fabonici series:-");
		n=sc.nextInt();  
		
    
	  
	   for(int i=0; i<n; i++)
	   {
	   
	    System.out.print("   " +num1);
	    
	   	sum = num1 +num2;
	   	num1 = num2;
	   	num2 = sum;
	   	 }
		
	   
	
	  	// your code goes here
	}
}