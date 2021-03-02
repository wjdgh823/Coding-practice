package Quiz_if;

import java.util.Scanner;

public class Quiz_if_01 {

	public static void main(String[] args) {
		
		/*
		총 90분이고,
		현재 1반이 0점, 2반이 2점인 상황, 1반은 최고의 스트라이커인 성익이를 투입
		성익이는 5분마다 골 넣는다.
		만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
		(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 동내심판인 성빈이는 성익이가 잘 되는 것을 싫어하기
		때문에 추가시간 따위는 주지 않는다. )
		현재 경기타임과 우리팀의 득점이 입력으로 주어 질때, 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.
		*/
		Scanner sc = new Scanner(System.in);
		
		int totaltime = 90;
		int recenttime = sc.nextInt(); 
		int myteam_score = sc.nextInt();
		
		if (totaltime - recenttime <= 5) {
			myteam_score += 1;
		} else {
			myteam_score += (totaltime - recenttime) / 5 + 1;
		}
		
		System.out.println(myteam_score);
		
		
	}

}