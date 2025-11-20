package thread_practice;


// find the intersection of two array
public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,2,8,6,7};
		
		System.out.println("Intersection (Output) :");
        
		boolean found = false;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]+" ");
					found = true;
				}
			}
		}
		if(!found) {
			System.out.println("no intersection!");
		}
		
	}

}










