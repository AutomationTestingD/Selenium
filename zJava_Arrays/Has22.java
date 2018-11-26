package zJava_Arrays;

public class Has22 {

	public static void main(String[] args) {


		int[] a = {1,5,2,2,8,6,4,2,2,5,1,4,5,2};
		
		int count =0;
		for(int i=0; i<a.length-1;i++)
		{
			
			if(a[i]==2 && a[i+1]==2) {
				
				
				count++;}
				}
				
		if (count>=1)
		System.out.println(true);
		else
			System.out.println(false);
		
				
			
		}
	}


