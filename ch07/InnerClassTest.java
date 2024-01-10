package ch07;

class A{
	int i = 100;
	
	class B{
		void method() {
			
			System.out.println(i);
		}
	
}
	
}


public class InnerClassTest {

	public static void main(String[] args) {
		B b = new B();
		b.method();
	
	}

}
