package java_coding;
import java.util.ArrayList;
import java.util.Arrays;

public class Lsearch {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(Arrays.asList(100,"RAM",null,12.5));
		
		System.out.println("Output of an Array List :"+a);
		System.out.println(isLinearSearch(a, "RAM")==true?"found":"not found");
		

	}
	
	public static boolean isLinearSearch(ArrayList a,Object find) {
		for(int i = 0; i <= a.size()-1; i++) {
			if(a.get(i).equals(find)) {
				return true;
			}
		}
		return false;
		
	}

}

