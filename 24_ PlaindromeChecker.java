package thread_practice;

import java.util.Scanner;

//  check the given string is palindrome or not
public class PlaindromeChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		
		int i = 0;
		int j = str.length() - 1;
		
		boolean found = true;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				found = false;
				break;
			}
			i++;
			j--;
		}
		if(found) {
			System.out.println(" is a palindrame!");
		}else {
			System.out.println("is not a palindrome!");
		}
	}

}

