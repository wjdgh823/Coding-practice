package Quiz_array;

import java.util.Arrays;
import java.util.Scanner;

public class array_05_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] val = new double[sc.nextInt()];
		
		for (int i = 0; i < val.length; i++) {
			val[i] = sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(val); // 숫자 크기대로 나열한다.
		
		for(int i = 0; i < val.length; i++) {
			sum += ( (val[i] / val[val.length-1]) * 100 ); 
			// 맨 마지막에 있는 max 값을 가져와서 sum의 값에 더해서 저장한다
		}
		System.out.println( sum/val.length );
	}

}
