package JavaExam;

class People1 {

	public String name;

	public String ssn;

public People1(String name, String ssn) {

    	this.name = name;
    	this.ssn = ssn;
}

}

public class Student1 extends People1 {

	public int studentNo;

	public Student1 (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;	

	}

	public static void main(String[] args) {

		Student1 student = new Student1("홍길동", "123456-123456", 1);
		System.out.println("Name: " + student.name);
		System.out.println("SSN: " + student.ssn);
		System.out.println("Student: " + student.studentNo);

}
}

