/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		float sum = 0;
		float tax;
		float CTC;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of months");
		n = sc.nextInt();
		int []array = new int[n];
		System.out.println("enter the array");
		for(int i =0; i<n; i++){
			array[i] = sc.nextInt();
			
		}
		System.out.println("salary of months are ");
		for(int i=0; i<n;i++){
			System.out.println( "salary of months " +array[i]);
				sum = sum + array[i];
		}
	
		System.out.println("annual CTC  "  +sum);
		System.out.print(" tax deduction ");
		tax = (float)((sum/100)*30);
		System.out.println(tax);
		CTC = sum - tax;
		System.out.println("salary in hand " +CTC);
	
		
		// your code goes here
	}
}