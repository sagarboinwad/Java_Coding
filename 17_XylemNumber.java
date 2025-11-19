package stream_basic;

import java.util.Scanner;

public class XylemNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to check (Xylem number) :");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] arr = new int[count];
        temp = num;

        for (int i = count - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        int number = arr[0] + arr[arr.length - 1];
        int mean = 0;

        for (int i = 1; i <= arr.length - 2; i++) {
            mean += arr[i];
        }

        if (number == mean)
            System.out.println(num + " is a Xylem number");
        else
            System.out.println(num + " is a Phloem number");
    }
}
