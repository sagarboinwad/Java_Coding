package thread_practice;

import java.util.Arrays;
import java.util.Scanner;

// write a program to perform binary search on sorted array
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {20,10,40,30,60,50,80,70,90};
		Arrays.sort(arr);
		System.out.println("Enter element to search :");
		int key = sc.nextInt();
		int low = 0, high = arr.length-1;
		
		boolean found = false;
		while(low <= high) {
			int mid = (low + high) / 2;
			System.out.println(mid);
			if(key == arr[mid]) {
				System.out.println("element found at index :"+mid);
				found = true;
				break;
				
			}else if(key < arr[mid]) {
				high = mid-1;         //left search
			}else {
				low = mid+1;          //right search
			}
			
		}
		if(!found) {
			System.out.println("Element not found!");
		}
		sc.close();
	}

}
