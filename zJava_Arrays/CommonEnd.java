package zJava_Arrays;

public class CommonEnd {
	
	public static void main(String[] args) {
		String s ="Both arrays are having common end";
		String s1 ="Both arrays are not having common end";
		
		int[] a= {4,2,600,4,111};  		int[] b= {1,48,1111};
		
		System.out.println(commonEndArray(a,b));
	}
	
	public static String commonEndArray(int[] a, int[] b) {
		
		String s ="Both arrays are having common end";
		String s1 ="Both arrays are not having common end";
		
		if(a[(a.length-1)]==b[(b.length-1)]) return s;
		
		else  return s1;
		
		
	}

}
