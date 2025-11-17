package java_coding;
import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element :");
		int n = sc.nextInt();
		
		int target = n * n;
		System.out.println(target);
		int sum = 0;
	
		while(target > 0) {
			int lastdigit = target % 10;
			sum = sum + lastdigit;
			target = target / 10;
		}
		if(sum == n) {
			System.out.println( n+ " is a neon number");
		}else {
			System.out.println( n+ " is not neon number");
		}

	}

}
