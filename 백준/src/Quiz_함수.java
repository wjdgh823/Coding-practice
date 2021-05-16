public class Quiz_함수 {
	
	static long sum(int[] a) {
		
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int [] a = {5,1,3,4,12,23,412,23};
		long n = sum(a);
		System.out.println(n);
	
	}
	
}
