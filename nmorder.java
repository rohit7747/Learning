/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{    int n,m ;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter the order:-");
	     n=sc.nextInt();
	     m=sc.nextInt();
	    
		int [][]a = new int[n][m];
	
		
		 for( int i=0; i<n ;i++)
		 {
		     for(int j=0; j<m; j++){
		     	a[i][j] = sc.nextInt(); 
		 	  System.out.print(" " +a[i][j]);
		     }
		 
		 	  
		 	
		       System.out.println();
		 }
		  
	}
}