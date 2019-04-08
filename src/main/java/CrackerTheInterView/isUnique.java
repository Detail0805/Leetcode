package CrackerTheInterView;

public class isUnique {
	
	
	public static void main(String[] args) {
		isUnique iu = new isUnique();
		String s = "abcdddd";
		System.out.println(iu.isUnique(s));
		System.out.println(iu.isUnique2(s));
	}
	/**
	 * 時間複雜 O(N) 空間複雜O(1)
	 * @param s
	 * @return
	 */
	public boolean isUnique(String s){
		if(s==null||s.length()>256){
			return false;
		}
		boolean[] check=new boolean[256];
		char[] test=s.toCharArray();
		for(char c:test){
			if(check[c]){
				return false;
			}
			check[c] = true;
		}
		return true;
	}
	/**
	 * 假設只有小寫的情況下
	 * @param s
	 * @return
	 */
	public boolean isUnique2(String s){
		if(s==null||s.length()>26){
			return false;
		}
		int checker = 0;
		char[] chars = s.toCharArray();
		for (char c : chars) {
			int val = c - 'a';
			System.out.println("checker :"+checker);
			System.out.println("val :"+val);
			System.out.println("1 << val:"+(1 << val));
			System.out.println((3&4));
			System.out.println((15&3));
			System.out.println((14&3));
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	
}
