package quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class QuLottoCollection {
	public static void main(String[] args) {
		Random random = new Random();

		// 로또 번호는 중복된 숫자가 있으면 안되므로 set계열의 컬렉션을 생성합니다.
		HashSet<Integer> setLotto1 = new HashSet<Integer>();

		// 중복되지 않은 난수를 생성하기 위해 무한루프 내에서 반복한다.
		while (true) {
			// 1과 45사이의 난수를 생성해서 Set에 추가합니다.
			// 이때 중복된 숫자는 저장되지 않습니다. Set컬렉션 이기때문에

			setLotto1.add(random.nextInt(45) + 1);
//		arrParam[i] = rnd.nextInt(45)+1;

			// 숫자 6개가 저장되었다면 무한루프를 탈출합니다.
			if (setLotto1.size() == 6)
				break;

		}
		// Set은 컬렉션은 정렬되지않는다.
		System.out.println(setLotto1);

		// Set 컬렉션은 정렬은 되지않으므로 List 컬렉션으로 변환한다.
		ArrayList<Integer> listLotto = new ArrayList<Integer>(setLotto1);
		listLotto.sort(Comparator.naturalOrder()); // 오름차순정렬
//		listLotto.sort(Comparator.reverseOrder());  //  내림차순정렬
		// 정렬된 로또 번호를 출력합니다.
		System.out.println(listLotto);

		// TreeSet<> 켈렉션은 중복은 허용하지 않지만 Tree라는 자료구조를 기반으로 정렬은 허용한다.
		// Integer 클래스와 같은 기본 클래스는 별도의 오버라이딩 없이도 오름차순으로 정렬된 상태로 저장된다.

		TreeSet<Integer> treeLotto = new TreeSet<Integer>();

		while (true) {

			treeLotto.add(random.nextInt(45) + 1);

			if (treeLotto.size() == 6)
				break;
		}
		System.out.println(treeLotto);

	}

}
