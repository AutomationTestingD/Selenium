package zJava_Arrays;

import java.util.Arrays;

public class CenteredAverage {

	public static void main(String[] args) {
		
		int nums[] = {1,5,2,4,6,5};
		
		 int max = nums[0];

			int min = nums[0];

			int sum = nums[0];

			for(int i = 1; i < nums.length; i++)

			{

				sum  += nums[i];

				if(nums[i] > max)

					max = nums[i];

				else if(nums[i] < min)

					min = nums[i];

			}

			System.out.println( (sum-max-min) / (nums.length - 2));

		}
	
}
