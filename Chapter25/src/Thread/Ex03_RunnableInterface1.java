package Thread;

class MyThread3 implements Runnable{
	
	public void run() {
		int sum = 0;
		for(int i=0; i<=10; i++)
			sum = sum + i;
		
		// Thread 이름이 없으면 숫자로 줌?? 이뭔소리야
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " +sum);
	}
}

public class Ex03_RunnableInterface1 {

	public static void main(String[] args) {
		
	Thread t = new Thread(new MyThread3());
	t.start();  // run() 을 불러옴 start로  run으로 실행을 던지고 나서 바로 아랫줄 실행 그 후에 run이 나오는 이유!!
	System.out.println("main  : "+ Thread.currentThread().getName());
	}
	
}
