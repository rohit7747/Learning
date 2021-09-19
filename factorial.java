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
	    n=sc.nextInt();  
		
		System.out.println("enter the number:-" +n);
	//	n = sc.nextint();
		int fact = 1;
		for(int i=1; i<= n; i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial:-" +fact);
		// your code goes here
	}
}