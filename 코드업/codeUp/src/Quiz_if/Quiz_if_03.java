package Quiz_if;

import java.util.Scanner;

public class Quiz_if_03 {

	public static void main(String[] args) {
		
		/*
		 수호는 30분 전으로 돌아가고 싶은 1人 이다.
		 공백을 기준으로 시간과 분이 주어진다.
		 그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.

		 예)
		 12 35  =====> 12 5
		 12 0 ======> 11 30
		 11 5 ======> 10 35
		*/
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int pre_minute = sc.nextInt();
		
		if (minute >= pre_minute) {
			minute -= pre_minute;
		} else if (minute < pre_minute) {
			hour -= 1;
			minute = 60 - (pre_minute - minute);
		}
		
		System.out.println(hour + "시" + minute + "분");
		

	}

}
