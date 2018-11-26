package zJava_Arrays;

import java.util.Arrays;

public class Set3to0If3OccursImmidatelyAfter2 {

	public static void main(String[] args) {
	
         int[] a = {2,3,2,3,2,3,2,3,5,6,8,5,4,3,5,3,6,2,3};   
         int[] b =fix23(a); 
          System.out.println("Updated Array: "+Arrays.toString(b));
	  }
	
	public static int[] fix23(int[] a) {
		
		 System.out.println("\n"+"Actual  Array: "+Arrays.toString(a)+"\n");
		
		    for(int i=0; i<a.length; i++) {
			
			    if(a[i] == 2 && a[i+1]==3) {
				a[i+1] = 0;
			    } 
		      }		
		  return a;
	    }
  }
