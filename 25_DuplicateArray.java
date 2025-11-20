package thread_practice;


// find the duplicate element in array 
public class DuplicateArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4,4,6};
		
		
		System.out.println("Duplicate number :");
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length-1; j++) {
				if(arr[i] == arr[j]) {
					 System.out.println(arr[i]+" ");
					 break;
				} 
			}
		}
	}

}






