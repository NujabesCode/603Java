package ch04;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) +1;
		//1 ~ 100 사이의 랜덤값 저장.
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		
		}while(input != answer);//두 값이 같지 않으면이니, 같으면 조건문을 벗어남.
							    //조건식으면 참이면 반복.

		System.out.println("정답입니다.");
	}
	
}
