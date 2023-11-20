package ex15usefulclass;

class myFriends extends Object {
	String myName;

	public myFriends(String name) {
		myName = name;
	}

	@Override
	public String toString() {
		return "이름:" + myName;
	}
}

class yourFriends extends Object {
	String myName;
	
	public yourFriends(String name) {
		myName = name;
		System.out.println(name);
		return;
		
		
		
	}
}

public class E04Object1toString {
	public static void main(String[] args) {
		
		myFriends fnd1 = new myFriends("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		Object fnd3 = new yourFriends("헬로");
		
//		fnd3.your
		System.out.println(fnd1);
		System.out.println(fnd2);
		
		
}
}