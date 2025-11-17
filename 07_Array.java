import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
		System.out.println("print an array using for loop ");
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("============================");
		
		System.out.println("print an array using for each loop");
		for(int a : arr) {
			System.out.println(a+" ");
		}
		System.out.println("===========================");
		
		System.out.println("print an array using Arrays class");
		System.out.println(Arrays.toString(arr));
    }
}
