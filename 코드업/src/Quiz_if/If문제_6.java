package Quiz_if;

import java.util.Scanner;

public class If문제_6 {

	public static void main(String[] args) {
		
		/*
		월이 입력될 때 계절 이름이 출력되도록 해보자.

		예)
		월 : 계절 이름
		12, 1, 2 : winter
		3, 4, 5 : spring
		6, 7, 8 : summer
		9, 10, 11 : fall
		*/
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.print("winter");break;
		case 3:
		case 4:
		case 5: System.out.println("spring");break;
		case 6:
		case 7:
		case 8: System.out.println("summer");break;
		case 9:
		case 10:
		case 11: System.out.println("fall");break;
		}
		
		
	}

}





