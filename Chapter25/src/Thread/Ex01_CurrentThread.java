package Thread;

public class Ex01_CurrentThread {
	public static void main(String[] args) {
		//현재 스레드 이름 : main  main은 스레드의 일종
		String name = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : " + name);
	}

}
