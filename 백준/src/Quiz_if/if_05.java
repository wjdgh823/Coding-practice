package Quiz_if;

import java.util.Scanner;

public class if_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (hour < 0 || hour > 24) {
			System.out.println("시간은 0 ~ 24까지만 입력가능합니다.");
			return;
		} 
		if (min < 0 || min > 59) {
			System.out.println("분은 0 ~ 59까지만 입력가능합니다");
			return;
		}
		
		if  (hour == 0 && min < 45) {
			hour = 23;
			min = 60 - (45 - min);
		} else if (min > 45) {
			min -= 45;
		} else if (min < 45) {
			hour -= 1;
			min = 60 - (45 - min);
		}
		
		System.out.println(hour + " " + min);
		
	}

}
