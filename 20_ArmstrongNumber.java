package thread_practice;

public class Armstrong {
	
	public static int isPower(int rem, int digits) {
		int product = 1;
		for(int i = 1; i <= digits; i++) {
			product = product * rem;
		}
		return product;
	}

	public static void main(String[] args) {
		int num = 153;
		
		int sum = 0;
		int original = num;

		int temp = num;
		int digits = 0;
		while(temp != 0) {
			digits++;
			temp = temp / 10;
		}
		
		while(num != 0) {
			int rem = num % 10;
			sum = sum + isPower(rem, digits);
			num = num / 10;
		}
		
		System.out.println(sum);

		if(sum == original) {
			System.out.println(original + " is an Armstrong number!");
		} else {
			System.out.println(original + " is not an Armstrong number!");
		}

	}
}
