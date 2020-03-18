import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NoOfGroupOfFriend {

	public static void main(String[] args) {
	
		int n = 5;
		int[][] set = {{2,4,6},{3,6},{4},{5},{6}};
		boolean[] visited =  new boolean[7];
		
		HashMap<Integer, Set<Integer>> noofgroups = new HashMap<Integer, Set<Integer>>();
		
		for (int i = 0; i < n; i++) {
			noofgroups.put(i+2, new HashSet<Integer>());
		}
		merge(noofgroups, set, 2, visited);
		
		// return no of item 
		
		System.out.println(noofgroups.size());

	}
	
	public static void merge(Map<Integer,Set<Integer>> noofgroups, int[][] set, int no, boolean[] visited) {
		
		// set is empty 
				// return
				
		if(set[no].length==0) {
			return ;
		}
		// if item is visited 
		// return
		if(visited[no]== true) {
			return;
		}else {
			
			visited[no] = true;
			for (int i = 2; i < set[no-2].length; i++) {
				
				merge(noofgroups, set, set[no-2][i-2], visited);
				
				combine(noofgroups, no, set[no-2][i-2]);
				
			}
		
		}
		
		// if item is not visited
		// set has item
		// merge
		// combine 
		// visited
		
		
	}
	
	public static void combine(Map<Integer,Set<Integer>> noofgroups, int  srcno, int target) {
		
		noofgroups.get(srcno).addAll(noofgroups.get(target));
	}

}
