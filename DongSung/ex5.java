package DongSung;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Score = scanner.nextInt();
		if(Score >= 90) {
			System.out.println("A");
		}else if(Score >= 80) {
			System.out.println("B");
		}else if(Score >= 70) {
			System.out.println("C");
		}else if(Score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
