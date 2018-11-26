package zJava_Arrays;

import java.util.Arrays;

public class bigDiff {

	public static void main(String[] args) {
		
		int[] a = {7,2,10,9};
		int temp =0;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1;j<a.length; j++) {
			
				//swap
			  if(a[i]>a[j]) {
				 temp = a[i];
				 a[i]=a[j];
				  a[j] = temp;
				  
			  }
			  else
				  a[i]=a[i];
		}}
		System.out.println(Arrays.toString(a));
		
		
int result = a[a.length-1]-a[0];
System.out.println(result);
	

	}
}

/*public int bigDiff(int[] nums)

{

	int max = nums[0];

	int min = nums[0];

	for(int i = 1; i < nums.length; i++)

	{

		if(nums[i] > max)

			max = nums[i];

		else if(nums[i] < min)

			min = nums[i];

	}

	return (max-min);

}

*/
