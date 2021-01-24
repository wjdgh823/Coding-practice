package Quiz_중첩반복문;

public class quiz_중첩반복문_구구단 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + "    ");
				if (j == 5) {
					System.out.println();
				}
			}
		}
		
	}

}
