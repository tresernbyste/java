package common;

import java.util.Objects;

public class Teacher extends Person{
	private String subject;
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		
	}
	@Override
	public String toString() {
		return super.toString() + ", 과목:"+ subject;
	}
	
	
	
	
	@Override
	// hashcod 객체가 가진 고유한 주소값을 정수형으로 반환해준다. 
	//  다른 객체라면 다른값을 반환하게 된다
	public int hashCode() {
		int returnCode1 = super.getAge() + this.subject.hashCode();
		System.out.println("returnCode1=" + returnCode1);
		
		int returnCode2 = Objects.hash(super.getAge(), this.subject);
		System.out.println("returnCode2=" + returnCode2);
		
		return returnCode2;
	}
	
	@Override
	public boolean equals(Object obj) {
		Teacher teacher = (Teacher)obj;
		
		//   나이랑 과목을 비교해보고 같은면 true 다르면 false
		if((teacher.getAge()==super.getAge()) && teacher.subject.equals(this.subject)){
			return true;
		}
		else {
			return false;
		}
	}
}

