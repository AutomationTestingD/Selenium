package zJava_Arrays;

public class LenearIn {

	public static void main(String[] args) {


		int[] a = {1,2,4,4,6};
		int[] b = {2,3,4};
		
		int k=0;
		int count=0;
		for(int i=0; i<=b.length;i++) {
			
		if(b[k]==a[i]) {
			count++;
			k++;			
		}
		}
		if(count==b.length)
		System.out.println("same");
		else
			System.out.println("not same");				
		
	}	

}
