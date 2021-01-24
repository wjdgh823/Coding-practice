package Quiz_반복문;

import java.util.Scanner;

public class quiz_반복문_주식투자 {

	public static void main(String[] args) {
		
		/*
		 * gbs라는 개미투자자 주식 투자
		 * 
		 * 이 사람이 투자한 돈의 액수, 그 주식의 하루간의 변동을 퍼센트로 알 때,
		 * 이 사람의 순수익, 이득/손해 판단을 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int fundMoney = sc.nextInt();  // 투자한 액수
		int fundDayCount = sc.nextInt();  // 투자한 일 수
	
		int count = 0;
		int result = fundMoney;
		while (true) {
			
			count++; // 1 2 3
			int percent = sc.nextInt(); // 10 20 30
			
			if (percent < 0) {
				percent *= -1;
				result -= (result * (percent * 0.01));
				
			} else {
				result += (result * (percent * 0.01));
			}
			
			if(count == fundDayCount) {
				System.out.println("투자한 금액 : " + fundMoney + "원");
				System.out.println("투자 후의 결과 : " + result + "원");
				break;
			}
		}
		
		int lose = 0;
		int win = 0;
		if (fundMoney > result) {
			lose = (fundMoney - result) * -1;
			System.out.println(lose + "원 의 손해, bad!" );
		} else if (fundMoney == result) {
			System.out.println("본전");
		} else {
			win = (result - fundMoney);
			System.out.println(win + "의 이득, good!");
		}
		
	
	}

}
