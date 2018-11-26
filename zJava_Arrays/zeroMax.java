package zJava_Arrays;

import java.util.Arrays;

public class zeroMax {

	public static void main(String[] args) {
		int[] a = {0,1,0};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==0) {
				
				for(int j=i;j<a.length;j++) {
								
					if(a[j]%2!=0) {
						
					a[i]=a[j];
			}}}
			
		}
		
	System.out.println(Arrays.toString(a));
	}}
		
				
	


