package Quiz_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_데이터재정렬 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[][] nArr = new int[2][n];
		int[] nArr2 = new int[n];
		for(int cnt=0; cnt<n; cnt++) {
			nArr[0][cnt] = in.nextInt();
			nArr2[cnt] = nArr[0][cnt];
		}
		
		Arrays.parallelSort(nArr2);
		
		for(int cnt1=0; cnt1<n; cnt1++) {
			for(int cnt2=0; cnt2<n; cnt2++) {
				if(nArr2[cnt1]==nArr[0][cnt2]) {
					nArr[1][cnt2]=cnt1;
					break;
				}
			}
		}
		
		for(int cnt=0; cnt<n; cnt++) {
			System.out.print(nArr[1][cnt] + " ");
		}


	}

}
