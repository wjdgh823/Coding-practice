package Quiz_반복문;

import java.util.Scanner;

public class quiz_반복문_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		recycle:
			while (true) {
				num = sc.nextInt();
				System.out.println(num);
				if (num == 0) {
					break recycle;
				}
			}
	
		
	}

}
