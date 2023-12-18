import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex02_Pipeline {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		// 정수형 스트림
//		IntStream stm1 = Arrays.stream(arr);
//		IntStream stm2 = stm1.filter(n -> n % 2 == 1);
//		int sum = stm2.sum(); 
		
//		위 Stream 을 축약 
//		PipeLine화 했다~~
		int sum = Arrays.stream(arr)
						.filter(n -> n % 2 == 1)
						.sum();

		System.out.println(sum);

	}

}
