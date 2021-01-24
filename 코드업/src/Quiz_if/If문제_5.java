package Quiz_if;

import java.util.Scanner;

public class If문제_5 {

	public static void main(String[] args) {
		
		/*
		평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

		평가 내용
		평가 : 내용
		A : best!!!
		B : good!!
		C : run!
		D : slowly~
		나머지 문자들 : what?
		*/
		Scanner sc = new Scanner(System.in);
	
		String result = sc.next();
		if (result.equalsIgnoreCase("A")) {
			System.out.println("best!!!");
		} else if (result.equalsIgnoreCase("B")) {
			System.out.println("good!!");
		} else if (result.equalsIgnoreCase("C")) {
			System.out.println("run!");
		} else if (result.equalsIgnoreCase("D")) {
			System.out.println("slowly~");
		} else {
			System.out.println("what?");
		}
	}

}








