package java_coding;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L2search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<= 5; i++) {
		    System.out.println("enter "+i+" index of linkedlist :");
		    l.add(sc.nextInt());
		}
		
		System.out.println("Output linklist :"+l);

	}

}
