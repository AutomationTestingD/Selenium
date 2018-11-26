package zJava_Arrays;

import java.util.Arrays;

public class Fix34 {

	public static void main(String[] args) {


		int[] a = {1,5,4,2,3,5,2,8,4,4,5,3,3,2,2};
		 int temp =0;
		
		for(int i=0;i<a.length; i++) {
			
			if(a[i]==3) {				
			
			for (int j=0; j<a.length;j++ ) {
				
				if(a[j]==4 && a[j-1]!=3) {
				
					temp = a[j];
					a[j] = a[i+1];
					a[i+1]=temp;
				
				}			}	
											}
			}
		System.out.println(Arrays.toString(a));

	}

}
