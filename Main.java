
public class Main {
	
	public static void main(String[] args) {
		
		int[] arr1 = {0,3,4,31};
		int[] arr2 = {4,6,30};
		
		MergeLists ml = new MergeLists();
		
		
		
		System.out.println(toString(ml.mergeLists(arr1, arr2)));
		
	}
	
	
	public static String toString(int[] arr) {
		
		String str = "[";
		
		for(int i = 0; i < arr.length; ++i) {
			
			
			str += arr[i] + ", ";
			
		}
		
		str += "]";
	
		return str;
	}
	

}
