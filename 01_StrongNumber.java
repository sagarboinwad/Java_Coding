package java_coding;

public class strongNumber {
	
	public static int isFactorial(int rem) {
		int product = 1;
		for(int i = 1; i <= rem; i++) {
			product = product * i;
			
		}
		return product;
	}

	public static void main(String[] args) {
		int num = 147;
		
		int temp = num;
	    int sum = 0;
	    while(num != 0) {
	    	int rem = num % 10;
	    	sum += isFactorial(rem);
	    	num = num / 10;
	    	
	    }
	    if(sum == temp) {
	    	System.out.println("it is strong number!");
	    }else {
	    	System.out.println("it is not strong number!");
	    }
		
			
		

	}

}
