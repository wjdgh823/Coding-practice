package CodeUp_1010_1027;
import java.util.Scanner;

public class codeup_1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\'" + arr[i] + "\'");
		}
		
	}

}
