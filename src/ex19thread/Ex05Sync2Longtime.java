package ex19thread;

class Increment {
	int num = 0;

//	public void increment() { 
//		num++;
//	}
//  동기화 처리가 되지않은 메서드 : 결과는 비정상적으로 나온다. 대신 실행속도는 매우빠르다. 

	public int getNum() {
		return num;
	}

	public void increment() { // 동기화 가능 시간이 오래거린다.  오래걸림
		synchronized (this) {
			num++;
		}

	}
}

class IncThread extends Thread {

	Increment inc;

	public IncThread(Increment inc) {
		this.inc = inc;
	}

	public void run() {
		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j <= 10000; j++) {
				inc.increment();
			}
		}
	}

}

public class Ex05Sync2Longtime {

	public static void main(String[] args) {

		Increment inc = new Increment();

		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		IncThread it3 = new IncThread(inc);

		it1.start();
		it2.start();
		it3.start();

//		it1.run();
//		it2.run();
//		it3.run();
		try {
			it1.join();
			it2.join();
			it3.join();
		} catch (InterruptedException e) {
		}
		System.out.println("결과 :" + inc.getNum());
	}
}
