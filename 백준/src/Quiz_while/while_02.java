package Quiz_while;

import java.io.IOException;
import java.util.Scanner;

public class while_02 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int a = sc.nextInt();
			int b= sc.nextInt();
			System.out.println(a+b);
		}
		
		sc.close();

	}
	

}
