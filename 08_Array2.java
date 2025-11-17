import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size :");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println("enter "+i+" index of an array element :");
			arr[i] = sc.nextInt();
		}
		System.out.println("===============================");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("=============================");
		for(int a : arr) {
			System.out.println(a+" ");
		}
		System.out.println("==============================");
		System.out.println("An array output arr :"+ Arrays.toString(arr));
    }
}
