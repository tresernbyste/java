import java.util.Arrays;
import java.util.List;

public class Ex04_Sorted {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","멀린","해리포터");
		
		// 글자 오름차순 sorted 기본
		list.stream()
			.sorted()
			.forEach(n->System.out.print(n + '\t'));
		
		System.out.println();
		
		
		// 글자 길이 오름차순 sorted 사용자가 설정한 정렬방법을 람다식으로 간편하게 정의
		
		list.stream()
			.sorted( (s1,s2)->s1.length()-s2.length() )
			.forEach(n->System.out.print(n+'\t'));
		
		System.out.println();
	}
}
