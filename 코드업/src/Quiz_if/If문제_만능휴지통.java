package Quiz_if;

import java.util.Scanner;

public class If문제_만능휴지통 {

	public static void main(String[] args) {
		
		/*
		 * 민호 발명 좋아한다. 프로그램도 좋아함
		 * 어느날 휴지통이 꽉 차서 불편했다
		 * 그래서 휴지통이 n만큼 가득 차면 쓰레기를 압축해주는 휴지통을 만들려고 한다.
		 * 이때 압축하는 알고리즘은 다음과 같다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("휴지통의 자동압축 기준량 입력 : ");
		String n = sc.next();
		String ten = n.substring(0, 1);
		String one = n.substring(1);
		String change = one + ten;
		int result = Integer.parseInt(change) * 2;
		System.out.println(result);
		
		if (result > 50) {
			System.out.println("oh my god");
		} else {
			System.out.println("good");
		}
		
		
	}

}
