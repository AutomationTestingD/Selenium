package zJava_Arrays;

public class MaxMirror {
	

	public static void main(String[] args) {


		int[] a = {1,2,3,8,9,3,2,1};
		int	count=0;
		
		for(int i=0;i<a.length;i++) {
			
			count=0;
		for(int j=a.length-1;j<a.length-1;j--) {
			
		if(a[i]==a[j]) {
			
			count++;
			i++;
			
		
		}
		}
		}
			
		System.out.println(count);	
		
		}

}
