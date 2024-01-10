package JavaExam;

import java.util.Scanner;

public class Exam04 {
	
	//시험 점수를 입력받아 80 ~ 100점은 A, 60 ~ 79점은 B, 40 ~ 59점은 C, 20 ~ 39점은 D,나머지 점수는 F를 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Score = scanner.nextInt();
		if(Score >= 80) {
			System.out.println("A");
		}else if(Score >= 60){
			System.out.println("B");
		}else if(Score >= 40){
			System.out.println("C");
		}else if(Score >= 20){
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}
}