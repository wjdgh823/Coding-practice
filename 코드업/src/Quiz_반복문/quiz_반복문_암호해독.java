package Quiz_반복문;

import java.util.Scanner;

public class quiz_반복문_암호해독 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int min = a;
	
			
			for(int i = 2; i <= a; i++) { // a=24라면 i= 1,2,3,4,5,6,7,8...22,23,24
				if (a % i == 0) {
					if (min > i) {
						min = i;
						
					}
				}
			}
			
			for(int i = 0; i <= a; i++) {
				if (min * i == a) {
					System.out.println(min + " " + i);
					break;
				}
			}
	
		
	}

}
