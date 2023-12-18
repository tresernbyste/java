import java.util.stream.IntStream;

public class Ex06_PreTerminal {
	public static void main(String[] args) {
		
		// Stream 함수 종류  sum count average
		
		int sum = IntStream.of(1,3,5,7,9).sum();
		System.out.println(sum);
		
		long cnt = IntStream.of(1,3,5,7,9).count();
		System.out.println(cnt);
		
		IntStream.of(1,3,5,7,9)
				.average()
				.ifPresent(avg -> System.out.println("avg : " + avg));
				// ifPresent 값이 존재한다면 실행
		
		IntStream.of(1,3,5,7,9)
		.min()
		.ifPresent(min -> System.out.println("min : " + min));
		
		IntStream.of(1,3,5,7,9)
		.max()
		.ifPresent(max -> System.out.println("max : " + max));		
	}
}
 