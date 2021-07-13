package CodeUp_1028_1099;

import java.util.Scanner;

public class codeup_1084 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] color = sc.nextLine().split(" ");
		sc.close();
		
		int rPick = Integer.parseInt(color[0]);
		int gPick = Integer.parseInt(color[1]);
		int bPick = Integer.parseInt(color[2]);
		
		int cnt = 0;
		for(int r = 0; r < rPick; r++) {
			for(int g = 0; g < gPick; g++) {
				for(int b = 0; b < bPick; b++) {
					System.out.printf("%d %d %d\n", r, g, b);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		
	}

}
