/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class amit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int []array = {4,6,9,3,1};
		int i=0;
		while(i<5)
		{
		
			System.out.print(" " +array[i] );
			i++;
		}
		
		  int sum=0;
		  for(i=0; i<5; i++)
		    {
		    	
		  sum = sum + array[i];
		  System.out.println("\n");
		    }
		  System.out.println( "sum of array:- " +sum );
		    
		
		// your code goes here
	}
}