package thread_practice;
import java.util.Scanner;

// unique string
// eg- aabaadcc -> output-b
// use ASCII value
 
public class UniqueCharDetector{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string :");
		String str = sc.nextLine();
		
		boolean found = false;
		int[] arr = new int[256];
		for(char c : str.toCharArray()) {
			arr[c]++;
		}
		for(char c : str.toCharArray()){
			if(arr[c] == 1) {
				System.out.println(c);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(-1);
		}
	    
		
		
	}
}

