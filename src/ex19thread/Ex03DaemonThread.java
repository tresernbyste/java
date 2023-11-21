package ex19thread;


class NormalClass {
	String title;

	public NormalClass(String title) {
		this.title = title;
	}

	void classMethod() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s]i=%d%n", title, i);
		}
	}
}

class NormalThread extends Thread {

	public NormalThread() {
	}

	public NormalThread(String title) {
		super(title);
	}

	void threadMethod() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s]i=%d%n", getName(), i);
			sleep(2000);
		}
	}

	@Override
	public void run() {
		try {
			threadMethod();

		} catch (InterruptedException e) {

		}
	}
}

	class DaemonThread extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.printf("[쓰레드명: %s]Jazz가 흘러요~%n", getName());
				try {
					sleep(3000);
					System.out.println("3초마다 자동저장!!");
				} catch (InterruptedException e) {
					System.out.println("자동저장시 오류발생 ㅠㅠ");
				}
			}
		}
	}

public class Ex03DaemonThread {

	public static void main(String[] args) {
		NormalClass nt1 = new NormalClass("첫번째 클래스");
		nt1.classMethod();
		new NormalClass("두번째 클래스 ").classMethod();

		NormalThread yt1 = new NormalThread("1st 쓰레드");
//		yt1.setName("First 쓰레드");
		yt1.start();

		NormalThread yt2 = new NormalThread();
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();

		DaemonThread dt = new DaemonThread();
		dt.setName("데몬쓰레드");
		dt.setDaemon(true);
		dt.start();

		System.out.println("현재 활성화 된 상태의 쓰레드수" + Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명: " + Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위" + Thread.currentThread().getPriority());
		System.out.println("메인함수(Main Thread) 종료");
	}

}
