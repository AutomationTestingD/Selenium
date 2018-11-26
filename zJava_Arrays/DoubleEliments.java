package zJava_Arrays;

public class DoubleEliments {
	
	public static void main(String args[]) {
		
		
		int []a = {5,4};
		System.out.println(doubleElementsInArray(a));
		
	}
	
	public static String doubleElementsInArray(int[] a){
		
		String a1 ="Both elements are same in the given array";
		String b1 ="Both elements are not same in the given array";
		
		if(a[0]==a[1] )	return a1;
		else return b1;
		
	}

}
