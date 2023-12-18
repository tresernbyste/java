package Thread;

class MyThread2 extends Thread{
	public void run() {
		int sum = 0;
		for (int i=0; i<=10; i++) 
			sum= sum+i;
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + sum);
	}
}

public class Ex02_ThreadClass {
	public static void main(String[] args) {
		
		MyThread2 t = new MyThread2();
		t.start();  // run() 을 불러옴 start로
		// main : main을 출력후  쓰레드 실행 과정에서 Thread-0 : 55  출력
		System.out.println("main 은 : "+ Thread.currentThread().getName());
		
	}
}
