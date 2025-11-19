package thread_practice;

import java.util.Scanner;

public class LargestString {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of String :");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		
		
		String longest = "";

		for(String s : arr) {
			if(s.length() > longest.length()) {
				longest = s;
				
			}
		}
		System.out.println("Largest String :"+longest);
		
	}
}

 
