package Quiz_if;

import java.util.Scanner;

public class If문제_4 {

	public static void main(String[] args) {
		
		/*
		점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.


		평가 기준
		점수 범위 : 평가
		90 ~ 100 : A
		70 ~   89 : B
		40 ~   69 : C
		0 ~   39 : D
		*/
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90 && score <= 100	) {
			System.out.println("A");
		} else if (score >= 70 && score <= 89) {
			System.out.println("B");
		} else if (score >= 40 && score <= 69) {
			System.out.println("C");
		} else if (score >= 0 && score <= 39) {
			System.out.println("D");
		} else {
			System.out.println("없는 점수입니다.");
		}
		
	}

}
