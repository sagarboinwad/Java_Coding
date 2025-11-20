package thread_practice;


// find missing number from an array of 1 to n
public class Array2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n = 5;

		int total = n * (n + 1) / 2;         //5 * (5 + 1) /2 = 5 * 3 = 15

	    int sum = 0;
		for (int num : arr) {                // forEach method
		    sum += num;                      // sum = 1+2+3+4+5  = 15
		}

		int missing = total - sum;           //15 - 15 = 0
		System.out.println("Missing number: " + missing);   // 0
	}

}
