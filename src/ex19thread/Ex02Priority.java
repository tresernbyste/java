package ex19thread;


class MessageSendingThread extends Thread{
	String message;
	public MessageSendingThread(String str) {
		message = str;  //이름만 지정 
	}
	public MessageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri); //  이름과 우선순위지정
	}
	public void run() {
		for (int i = 1; i <= 1000 ; i++) {
			System.out.println(message + i + "(" + getPriority() + ")");
			try {
				sleep(1);  // cpu의 유휴 상태로 인해 우선순위 설정을 했지만 무조건적인것은 아니다. 
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
public class Ex02Priority {
	//  main 도 쓰레드의 일종이다. 
	public static void main(String[] args) {
		
		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
		MessageSendingThread tr2 = new MessageSendingThread("두번째");
		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		
		// 우선순위를 지정하면  시작 자체는 높은 우선순위로 시작된다.
//		MessageSendingThread tr1 = new MessageSendingThread("첫번째",Thread.MAX_PRIORITY);
//		MessageSendingThread tr2 = new MessageSendingThread("두번째",Thread.NORM_PRIORITY);
//		MessageSendingThread tr3 = new MessageSendingThread("세번째",Thread.MIN_PRIORITY);

		
		tr1.start();  // 우선수위 부여전 전부 5로 동일하게 실행
		tr2.start();
		tr3.start();
		
		
	}
}