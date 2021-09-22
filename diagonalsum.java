/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int [][]a = { { 1,2,3 }, { 4,5,6 }, {7,8,9 } };
		int sum = 0;
		
		 for( int i=0; i<3 ;i++)
		 {
		
		 	  
		 	  System.out.print(" " +a[i][2-i]);
		 
		 	  sum = sum + a[i][2-i] ;
		 	
		       System.out.println();
		 }
		    System.out.print(" " +sum);
		 	// your code goes here
	}
}