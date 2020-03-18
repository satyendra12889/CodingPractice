import java.util.Arrays;

public class Permutation {

	// min  set 
	// max set 

	static int count = 0;
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		String str ="";
		permutation(arr, arr.length, str);
		// iterate 

		// output  
		// {1,2,3},{2,1,3},{2,3,1}, {3,1,2},{3,2,1}, {1,3,2}.
		// 
		/// whole set 

	}

	public static void permutation(int[] arr , int len, String str) {

		// extreme conditions
		// null sets
		if(arr == null) {
			return ;
		}

		if(len==0)
		{
			count ++; 
			System.out.println(str);
			System.out.println(count);
			return ;
			// 
		}

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=-1) {
				int[] arr1 = Arrays.copyOf(arr, arr.length);
				String str1 = new String(str);
				str1 += arr[i];
				arr1[i] = -1;
				permutation(arr1, len-1, str1);
			}
		}
		
	}



}
