package thread_practice;

import java.util.Scanner;

public class PrimNumber extends Thread{
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check (prime number):");
		
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		System.out.println(count==1?"prime number":"not prime number");
		}
    
}
