package ch07;

class Outer10{ //인스턴스 외부 클래스
	int value = 10;
	
	class Inner{ //인스턴스 내부 클래스
		
		int value = 20;
		
		void method1() { //인스턴스 내부 클래스 안의 내부 메소드
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer10.this.value);
			
		}
		
	}
}

public class Exercise7_8 {

	public static void main(String[] args) {
		
		Outer10 outer = new Outer10();
		Outer10.Inner inner = outer.new Inner();

		inner.method1();
	}

}
