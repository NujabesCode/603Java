package JavaExam;

import java.util.Scanner;

public class Exam02 {

	//2. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		//입력값이 있는 문제니까 스캐너를 이용한다.
		//스캐너 작성법이 기억 안나면 구글에 검색
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt(); // nextInt는 입력 받은 값인데 단지 변수 A에 담아주는거다
			int B = sc.nextInt();
			System.out.println(A+B);
		}


}
