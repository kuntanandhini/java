package CDC1;
import java.util.*;
public class List1 {
	
	public static void main(String[] args) {
		int[] arr1= {67,89,90,77,66,55};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 90);
		System.out.println(a);
		for(int b1:arr1)
		System.out.println(b1);
		System.out.println();

	}

}
