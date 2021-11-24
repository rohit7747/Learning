/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  
	  int []arr = new int[] { 1,2,3,4,5};
	  int sum = 0;
	  int n = 5;
	  int i = 0;
	  for( i=0; i< n; i++)
	  {
	  	sum = sum + arr[i];
	  	
	  }
	  System.out.print( "sum is " +sum);
	  System.out.print("\n");
	  float mean = sum/n;
	  System.out.print( " hence mean of array is:- " +mean);
	 
	  
	}
}