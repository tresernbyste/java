import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_Stream1 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		
		// 정수형 스트림 
		IntStream stm1 = Arrays.stream(arr);
		
		IntStream stm2 = stm1.filter(n -> n%2 == 1);
		
		int sum = stm2.sum();
		
		System.out.println(sum);
		
	}
}
