import java.util.Arrays;
import java.util.List;

public class Ex05_Map {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","orange");
		
		list.stream()
			// map은 데이터원형을 변경하는데 사용  대소문자변경   API데이터 가져와서 보기편하게 사용자가 원하는 방식으로 새롭게 맵핑
			.map(s -> s.toUpperCase())
			.forEach(n -> System.out.print(n + '\t'));
		
		System.out.println();
	}

}
