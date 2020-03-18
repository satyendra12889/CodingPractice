import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BinaryNoProblem {
	
	static Set<String> mp = new HashSet();
	static boolean finish = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] start = {'0','0','0','0','0'};
		char[] dest  = {'0','1','0','1','0'};
		char[] o = {};
		int no = 1;
		Queue<char[]> q = new ArrayDeque<>();
		q.add(start);
		if(compare(start, dest)) {
			System.out.println(0);
			return;
		}
		mp.add(new String(start));
		q.add(o);
		while(true) {
			char[] a = q.poll();
			if(a == o) {
//				System.out.println("adding empty");
				q.add(o);
				no++;
//				System.out.println("no printed" +no);
				continue;
			}
			while(a == o) {
				a=q.poll();
			}		
			
			for (int i = 0; i < a.length; i++) {
				char[] c = a.clone();
//				System.out.println(c);
				c = flip(c, i, a.length);
//				System.out.println(c);
				if(compare(c, dest)) {
					System.out.print("final "+no);
					return;
				}
//				System.out.println("comparing" +new String(c));
				if(mp.contains(new String(c))) {
//					System.out.println("any time" + new String(c));
					continue;
				}else {
					mp.add(new String(c));
					q.add(c);	
				}
			}
			
		}
	}
	
	
//	static void rec(char[] s, int no, char[] dest) {
//		if(new String(s).equals(new String(dest))){
//			System.out.println(no);
//			finish = true;
//		}
//		if(finish) {
//			return;
//		}
//		Integer iteration = mp.get(new String(s));
//		if(iteration !=null) {
//			return ;
//		}else {
//			mp.put(new String(s), no);
//		}
//		
//		for (int i = 0; i < s.length; i++) {
//			char[] c = s.clone();
//			flip(c, i, s.length);
//			rec(c, no+1, dest);
//		}
//	}
//	
	
	static Boolean compare(char[] c, char[] s) {
		for (int i = 0; i < s.length; i++) {
			if(c[i] != s[i]) {
				return false;
			}
		}
		return true;
	}
	static char[] flip(char[] s,int start, int end) {
//		System.out.println(start +" " +  end);
		for (int i = start; i < end; i++) {
			if(s[i] == '0') {
				s[i] = '1';
			}else if(s[i] == '1') {
				s[i] = '0';
			}
		}
//		System.out.println(s);
		return s;
	}

}
