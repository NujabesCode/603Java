package ch06;

import java.util.Arrays;

public class Exercise6_20 {
	
	/*max 메서드 정의
	메서드명:max
	기능:int형 배열의 값 중 제일 큰 값 반환.
	    만일 주어진 배열이 null이거나, 크기가 0이면, -999999를 반환
	매개변수:int[]arr - 최대값을 구할 배열    
	*/
	
	static int max(int[] arr) {
		if(arr==null || arr.length==0) 
			return -999999;
		
		int max = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;		
		
	}
	
	public static void main(String[] args) {
		
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {}));

	}

}
