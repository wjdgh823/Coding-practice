package Quiz_while;

import java.util.Scanner;

public class while_03 {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 처음 입력받은 숫자
		sc.close();
		
		int count = 0;
		int copy = n; // 처음입력받은 숫자를 copy에 저장한다.
		
		while(true) {
			
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			count++;
			
			if (n == copy) {
				break;
			}
		}
		System.out.println(count);
	}

}
