/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) //throws java.lang.Exception
	{
		int n;
	Scanner sc=new Scanner(System.in);  
	 System.out.println("enter no. of array:");
	  n = sc.nextInt();  
        //Initialize array  
        int [] arr = new int [n];/*{1, 2, 3, 4, 5};  */
        for(int i=0; i<arr.length; i++)  
           {  

                arr[i] = sc.nextInt();  
            }  
            System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<arr.length; i++)   
{  
System.out.println(arr[i]);  
}  

        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array:"+ sum);  
    }  
}  // your code goes here
	
