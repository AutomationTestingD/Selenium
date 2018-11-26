package zJava_Arrays;

import java.util.Arrays;

public class BiggerTwo {

	public static void main(String[] args) {				
		
		int[] a= {4,2,600,4,8};  		int[] b= {1,10,52,48,1};
		
		BiggerTwo bt = new BiggerTwo();
		int[] big = bt.biggerTwoArray(a, b);
		
		System.out.print("First Array : "+Arrays.toString(a)+"      ");
		System.out.println("Second Array : "+Arrays.toString(b));
		System.out.println("\n"+"Big Array : "+Arrays.toString(big));
		
	}
	
	public int[] biggerTwoArray(int[] a, int[] b) {
		
		int sum=0;		int sum2=0;
		
		for (int i=0; i<a.length; i++) {			
			sum +=a[i];		}
		
        for (int i=0; i<b.length; i++) {			
			sum2 +=b[i];		} 
        
        if (sum>sum2) return a;	else return b;
        }
	}


