package java_coding;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;


public class RecursiveArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Stream API
		System.out.println("Enter array size :");
		int[] arr = IntStream.range(0, sc.nextInt())
				.map(n->{System.out.println("Enter "+n +" index of an array element :");return sc.nextInt();})
				.toArray();
		
		System.out.println("Array output : "+Arrays.toString(arr));
		System.out.println("Enter first and last index :");
		IsSwap(arr,sc.nextInt(), sc.nextInt());
		System.out.println("Array Swap Output :"+ Arrays.toString(arr));

	}
	public static void IsSwap(int[] arr, int s, int l) {
		int temp = arr[s];
		arr[s] = arr[l];
		arr[l] = temp;
		
	}

}
