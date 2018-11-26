package zJava_Arrays;

import java.util.Arrays;

public class MakeDoubleSizeArrayOfLastElement {

	public static void main(String[] args) {
		
		int[] a = {5,2,4,8,5};
		
		int []b= makeLast(a);
		
		System.out.println(Arrays.toString(b));
		
	}

		public static int[] makeLast(int[] a) {
		
		int len = a.length*2;
		int[] res = new int[len];
		res[len-1] = a[a.length-1];

		return res;
	}
}