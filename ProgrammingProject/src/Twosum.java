import java.util.HashMap;
import java.util.Map;

public class Twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] new2 = {2,7,11,15};
		twoSum(new2, 9);
		
	}
	
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	       Map<Integer, Integer> map = new HashMap();
	       for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
	       for (int i = 0; i < nums.length; i++) {
	    	   int val = map.get(target-nums[i]);
			if(val>=0 ) {
				return new int[] {i,val}; 
			}
		}
	       return null;
	    }

}
