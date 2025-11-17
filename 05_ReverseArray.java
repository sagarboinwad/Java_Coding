package java_coding;

import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter elements: ");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Reversed array:");
        for(int i = num - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
	

}

