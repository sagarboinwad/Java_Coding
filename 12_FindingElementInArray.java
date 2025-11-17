import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an array size :");
        int[] arr = new int[sc.nextInt()];

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter " + i + " index of an array element");
            arr[i] = sc.nextInt();
        }

        System.out.println("=======================");

        for(;;) {

            System.out.println("Enter element to find :");
            System.out.println(isFind(arr, sc.nextInt()) ? "Found" : "Not Found");
            break;   
        }
    }

    public static boolean isFind(int[] arr, int find) {
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] == find)
                return true;
        }
        return false;
    }
}
