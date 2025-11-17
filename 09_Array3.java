import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an array size :");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println("Enter "+i+" index of an array element");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("===========================");
		System.out.println("Reverse Array :"+Arrays.toString(isRev(arr)));
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]+" ");
		}
    }
    
    public static int[] isRev(int[] arr) {
		int[] narr = new int[arr.length];
		for(int i = arr.length-1, j = 0; i >= 0; i--) {
			narr[j++] = arr[i];
		}
		return narr;
	}
}
