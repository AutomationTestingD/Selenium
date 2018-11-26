package zJava_Arrays;

import java.util.Arrays;

public class FormArrayWithFirstElements {

	public static void main(String[] args) {
		
		int[] a= {5,9,86,6,5,5,25,5};  		int[] b= {15,2,3};
		int[] c = front11(a,b);
		System.out.println(Arrays.toString(c));
		}
	
	public static int[] front11(int[] a, int[] b){
		
		if (b.length==0) {
			int c[] = {a[0]};
			return c;
		  }
		else if (a.length==0) { 
			int c[] = {b[0]};
			return c;
		  }
		else 		{
			int c[] = {a[0],b[0]};
			return c;
		  }			
		
		
		
	}  
}
