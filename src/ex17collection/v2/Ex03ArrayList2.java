
package ex17collection.v2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class Ex03ArrayList2 {

	public static void main(String[] args) {

		LinkedList<Student> list2 = new LinkedList<Student>();
//		ArrayList<Student> list2 = new ArrayList<Student>();

		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");

		list2.add(st1); // 인덱스 0
		list2.add(st2);
		list2.add(st3);
		list2.add(st4); // 인덱스 3
		list2.add(st2); // 리스트이므로 중복저장 가능

		System.out.println("출력1 일반for문");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		boolean removeOk = list2.remove(st2);
		System.out.println("인스턴스를 통한 삭제" + removeOk);

		System.out.println("출력 2 이터레이터");
		Iterator<Student> it2 = list2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		int idx = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요");
		String removeName = scanner.nextLine();
		for(Student st : list2) {
			if(removeName.equals(st.getName())) {
				list2.remove(st);
				break;
			}
		}
		System.out.println("현제 객체수:" + list2.size());
		
		System.out.println("삭제된 객체의 이름 :"+ list2.remove(2).getName());
		
		System.out.println("출력3 확장for문");
		for(Student st : list2) {
			System.out.println(st);
		}
		// 여기까지 작성하세요
	}

}
