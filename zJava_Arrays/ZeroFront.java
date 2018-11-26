package zJava_Arrays;

import java.util.Arrays;

public class ZeroFront {

	public static void main(String[] args) {

			int[] a = {0,1,0,1,0};
			int temp =0;
			
			for(int i=0;i<a.length;i++) {
				
				
				if(a[i]==0) 
				{
					a[i] =a[temp];
					a[temp] =0;
					temp++;					
				}
			}
	
		System.out.println(Arrays.toString(a));
	}
}
