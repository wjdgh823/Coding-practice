package Quiz_if;

import java.util.Scanner;

public class If문제_난이도3 {

	public static void main(String[] args) {
		
		/*
		세 개의 숫자가 주어질 때 두번째로 작은 수를출력해보자.
		예를 들어, 5 9 2 가 있다면 두번째로 작은 수는 5이다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();
		System.out.print("세번째 숫자 : ");
		int c = sc.nextInt();
		int result = 0;
		
		if (a <= b && a <= c) {
			if (b < c) {
				result = b;
			} else {
				result = c;
			}
		} else if (b <= a && b <= c) {
			if (a < c) {
				result = a;
				
			} else {
				result = c;
			}
		} else if (c <= a && c <= b) {
			if (a < b) {
				result = a;
			} else {
				result = b;
			}
		} 
		
		System.out.println(result);
		
		
	}

}
