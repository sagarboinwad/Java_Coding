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
		System.out.println("=======================");
		for(;;) {
		
			System.out.println("Max element :"+isMax(arr));
			break;
			
		}
    }
    
   
	
 public static int isMax(int[] arr){
		int max = arr[0];
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i] > max) 
				max = arr[i];
		}
		return max;
	}
	

}
