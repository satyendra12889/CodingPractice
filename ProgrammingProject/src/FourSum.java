import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] new2 = {-3,-1,0,2,4,5};
		fourSum(new2, 0);
		
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		 	Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        
	        for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					int k = j+1;
					int m = nums.length-1;
						
					while(k<m) {
						if(nums[i]+nums[j]+nums[m]+nums[k] == target) {
							
							List<Integer> l = new ArrayList<Integer>();
							l.add(nums[i]);
							l.add(nums[j]);
							l.add(nums[k]);
							l.add(nums[m]);
							list.add(l);
							k++;
							m--;
						}else if(nums[i]+nums[j]+nums[m]+nums[k] <target){
							k++;
						}else if(nums[i]+nums[j]+nums[m]+nums[k] >target) {
							m--;
							
						}
					}
				}
	           
				
			}
	       System.out.print(list);
	        return list;
    }

}
