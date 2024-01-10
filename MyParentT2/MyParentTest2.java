package MyParentT2;

import MyParentT.MyParentTest;

public class MyParentTest2 {

class MyChild extends MyParentTest{
	public void printMembers() {
		System.out.println(prv); //에러
		System.out.println(dft); //에러
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
	
}
	
	
	public static void main(String[] args) {
		MyParentTest p = new MyParentTest();
		System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);


	}

}
