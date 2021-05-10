package Quiz_array;

import java.util.HashSet;
import java.util.Scanner;

public class array_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> save = new HashSet<Integer>(); 
		// hashSet : 중복되는 값들이 들어올경우 버리고 하나의 값만 저장한다
		
		for (int i = 0; i < 10; i++) {
			save.add(sc.nextInt() % 42);
		}
		
		System.out.println(save.size());
		
	}

}
