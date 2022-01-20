/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [][]a = { {1,2,3,4} ,{5,6,7,8} ,{9,10,11,12} ,{13,14,15,16} };
		int i;
	
		
		for(i=0; i<4; i++) {
	    	if(i%2 != 0) {
	    		for(int j=3; j>=0; j--){
	    			System.out.print(" " +a[i][j]);
	    		}
            System.out.print( );
            } else {
		      	for(int j=0; j<4; j++) {
	    			System.out.print(" " +a[i][j]);
		      	}
            }
        }
		
	}
}