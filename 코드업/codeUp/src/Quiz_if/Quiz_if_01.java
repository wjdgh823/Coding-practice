package Quiz_if;

import java.util.Scanner;

public class Quiz_if_01 {

	public static void main(String[] args) {
		
		/*
		�� 90���̰�,
		���� 1���� 0��, 2���� 2���� ��Ȳ, 1���� �ְ��� ��Ʈ����Ŀ�� �����̸� ����
		�����̴� 5�и��� �� �ִ´�.
		���� 80�п� ������ �Ǹ� 80�п� ��ٷ� ���� �ְԵǰ� 85�п� ���� �������μ� ������ �����ϰ� �ȴ�.
		(90���̵Ǹ� ��Ⱑ �ٷ� ����ǹǷ� ���� ���� �� ����. ���������� �����̴� �����̰� �� �Ǵ� ���� �Ⱦ��ϱ�
		������ �߰��ð� ������ ���� �ʴ´�. )
		���� ���Ÿ�Ӱ� �츮���� ������ �Է����� �־� ����, �����̸� �����ϸ� �츮���� ���� ������ �� ������ ����Ͻÿ�.
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