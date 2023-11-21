package ex19thread;

class SumMulti2 {
	int num;

	public SumMulti2() {
		num = 0;
	}
//#1	synchronized public void addNum(int n) {  //  첫번째 동기화 방법 코드 실행시간이 오래걸릴순 있다.
//		num += n;
//	}
	
	
//#2	public void addNum(int n) {  // 정확한 값을 얻을수 없다.
	
//		num += n;
//	}
	
//	동기화 방법 3 동기화 블럭 (필요한 고드만 동기화한다.) 좋은성능을 보인다.
	public void addNum(int n) {
		synchronized (this) {
			num += n;
		}
	}

	public int getNum() {
		return num;
	}

}

class MultiAdderThread2 extends Thread {
	SumMulti2 sumInst;
	int start, end;

	public MultiAdderThread2(SumMulti2 sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	


	public void run() {
		for (int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
}

public class Ex05Sync3Method {
	public static void main(String[] args) {

		// 이렇게 되면 각각의 쓰레드가 제멋대로 들어오게 되고 그렇게 되면 하나의 힙값이 섞여 버릴수 있기때문에 정확한 합이 나올수가없다.
		SumMulti2 s = new SumMulti2();
		MultiAdderThread2 mat1 = new MultiAdderThread2(s, 1, 5000);
		MultiAdderThread2 mat2 = new MultiAdderThread2(s, 5001, 10000);
		mat1.start();
		mat2.start();		// start join

//		mat1.run();
//		mat2.run();

		try {
			mat1.join(); // 조인을 통해서 정확한 방법으로
			mat2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합:" + s.getNum());
	}
}
