package Quiz_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	private String namee;
	private int score;
	public Student(String namee, int score) {
		this.namee = namee;
		this.score = score;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}


public class Quiz_3등찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nStr = sc.nextLine(); // int와 String을 같이 입력 받을때 엔터키로 인한 오류 방지
		int n = Integer.parseInt(nStr); // 형변환
		
		ArrayList<Student> list = new ArrayList<Student>(); // 데이터 모델을 저장할 리스트 선언
		
		for (int i = 0; i < n; i++) {
			String rawStr = sc.nextLine(); // 이름과 점수를 입력받음
			String[] rawArr = rawStr.split(" "); // 이름과 점수를 공백을 기준으로 분리
			String name = rawArr[0]; // 이름
			String scoreStr = rawArr[1]; // 점수(스트링)
			int score = Integer.parseInt(scoreStr); // 점수 형변환
			
			list.add(new Student(name, score)); // 리스트에 저장
		}
		
		Collections.sort(list, new Comparator<Student>() { // 스코어의 내림차순으로 리스트를 정렬
			@Override
			public int compare(Student o1, Student o2) { 
				if (o1.getScore() > o2.getScore()) {
					return -1;
				} else if (o1.getScore() < o2.getScore()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		
		System.out.println(list.get(2).getNamee()); // 3번째로 성적이 높은 학생의 이름 출력
		
	} // end main()

} // end Main
