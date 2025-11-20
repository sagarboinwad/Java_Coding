package thread_practice;

import java.util.Scanner;

// count the uppercase, lowercase, digits, and special character in string
public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to check :");
		String str = sc.nextLine();
		

		
		int upper = 0, lower = 0, digits = 0, specialchar = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				upper++;
			}else if(ch >= 'a' && ch <= 'z') {
				lower++;
			}else if(ch >= '0' && ch <= '9') {
				digits++;
			}else {
				specialchar++;
		     }
		      System.out.println("Upper Case :"+ upper);
		      System.out.println("Lower Case :"+ lower);
		      System.out.println("digits :"+ digits);
	       	  System.out.println("Special Character :"+ specialchar);

	    }
		sc.close();
	}
}

