package JavaExam;

import java.util.Scanner;

//길이가 5인 배열을 생성한 후 5개의 정수를 입력받은 후 for문을 활용하여 입력받은 정수를 차례로 출력하시오.
public class Exam06 {
	
		public static void main(String[] args) {
			
			int[] arr = new int[5];
			
			Scanner scn = new Scanner(System.in);
			
			int i;
			
			for( i=0; i<5; i++){
				arr[i] = scn.nextInt();
				System.out.print(arr[i] +" ");
			}
		}

}
