/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n , i ,j;
		System.out.println("enter the array");
		n = sc.nextInt();
		int []arr = new int[n];
		for(i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
	
		}
         System.out.println("reverse of array");
		int len = arr.length;
		for(i= len-1; i >= 0; i--) {
		 
		  	System.out.println( arr[i] );

		
		}
			
		
	}
}