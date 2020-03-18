import java.util.Arrays;

public class Combination {
	static int count = 0;
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,-1};
		String str ="";
		int combNum = 4;
		combination(arr,0, arr.length,combNum, str);
		// iterate 

		// output  
		// {1,2,3},{2,1,3},{2,3,1}, {3,1,2},{3,2,1}, {1,3,2}.
		// 
		/// whole set 

	}
	
	public static void combination(int[] arr ,int start, int end, int no, String str) {

		// extreme conditions
		// null sets
		if(arr == null) {
			return ;
		}

		if(no==0)
		{
			count ++; 
			System.out.println(str);
			System.out.println(count);
			return ;
		}

		for (int i = start; i < arr.length; i++) {
			
//				int[] arr1 = Arrays.copyOf(arr, arr.length);
				String str1 = new String(str);
				str1 += arr[i];
//				arr1[i] = arr[i] = -1;
				if(i+no<arr.length) {
				combination(arr, i+1, arr.length, no-1,  str1);
				}
		}
		
	}

}
