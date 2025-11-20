package thread_practice;


import java.util.Scanner;

//  Reverse the order of words in a sentences
public class ReverseSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	  System.out.println("Enter the sentence :");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
	  String rev = " ";
		for(int i = words.length-1; i >= 0; i--) {
			rev += words[i]+" ";
			
		}
		System.out.println("Reverse string :"+rev);
		sc.close();

	}
	

}


