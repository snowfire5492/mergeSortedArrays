
public class MergeLists {
	
	public int[] mergeLists(int[] arr1, int[] arr2) {
		
		if(arr1 == null || arr2 == null || arr1.length == 0 && arr2.length == 0) {
			return null;
		}
		
		if(arr1.length == 0) {
			return arr2;
		}else if(arr2.length == 0) {
			return arr1;
		}
		
		int[] result = new int[arr1.length + arr2.length];
		
		int index1 = 0, index2 = 0, indexR = 0;
		
		while(index1 < arr1.length || index2 < arr2.length) {
	
			if(index1 < arr1.length && index2 == arr2.length || arr1[index1] < arr2[index2]) {
				result[indexR++] = arr1[index1++];
			}else{
				result[indexR++] = arr2[index2++];
				
			}
			
			
			
		}
		
		return result;
	}
	
	

}
