package CodeUp_Random;

import java.util.Scanner;

public class codeup_1171 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String Grade = sc.next();
		String Class = sc.next();
		String Num = sc.next();
		
		if (Class.length() == 1) {
			Class = "0" + Class; 
		} else {
			Class = Class;
		}
		
		if (Num.length() == 1) {
			Num = "00" + Num;
		} else if (Num.length() == 2) {
			Num = "0" + Num;
		} else {
			Num = Num;
		}
		
		System.out.println(Grade + Class + Num);
		
	}

}
