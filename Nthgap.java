/* package whatever; // don't place package name! */

import java.util.*;

import javax.swing.plaf.synth.SynthMenuUI;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Business
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the gap you need:-");
     	n=sc.nextInt();  
        System.out.print("\n");
     	
		int []arr = {4,5,6,9,0,2,11,17,5,5,4};
		
		//int i= 0;
		
        //while(i< arr.length)
        for(int i=0; i< arr.length; i+=n)
		{		    
			System.out.print(" " +arr[i]);
		  
			//i++;	
		}
		System.out.print(s);
	
		// your code goes here
	}
}