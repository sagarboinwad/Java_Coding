package thread_practice;

import java.util.Scanner;

// write a program to remove all vowels from a string
public class RemoveVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		
	    String replace = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
					ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
				replace += ch;
				
			}
		}
		System.out.println("result "+ replace);
		sc.close();
	}

}
