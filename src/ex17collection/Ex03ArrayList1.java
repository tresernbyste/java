package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		// LinkedList<String> list = new LinkedList<String>();
		// Vector<String> list = new Vector<String>();

		list.add("소녀시대");		// 0
		list.add("빅뱅");			// 1
		list.add("트와이스");		// 2
		list.add(3, "워너원");	// 3
//		list.add(5, "소방차"); 	// 4번인덱스여아함 4를 넣어야지만 5를 넣을수있기때문에 순서대로가 아니어서  에러발생
		list.add(list.size(), "오마이걸");
		list.add(list.size(), "방탄소년단");
		System.out.println("21중복 저장전 객체수 size:" + list.size());

		System.out.println(list.add("트와이스") ? "중복저장됨" : "중복저장안됨");
		System.out.println("24중복저장후 객체수 size:" + list.size());

		System.out.println("\n[일반for문 사용]");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");

		}

		System.out.println("\n[확장for문 사용]");
		for (String obj : list) {
			System.out.println(obj + " ");

		}

		System.out.println("\n[반복자 사용 ]");
		Iterator<String> itr = list.iterator();   //  반복자를 
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");

		}
		System.out.println("\n====================덮어쓰기========\n");

		list.set(4, "오마이걸>덮어쓰기");
		for (Object obj : list) {
			System.out.println(obj + " ");
		}

		System.out.println("\n===================삽입하기==========\n");

		list.add(4, "블랭핑크> 삽입하기");
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println("\n===================contains========\n");

		System.out.println(list.contains("빅뱅") ? "빅뱅있음" : "빅뱅없음");
		System.out.println(list.contains("블랙핑크") ? "블랙핑크있음" : "블랙핑크 없음");

		System.out.println("\n===================삭제하기 =======\n");
		
		Object obj = list.remove(2);
		System.out.println("삭제된객체" + obj);

		int index = list.indexOf("빅뱅");   // 빅뱅 인덱스 확인
		System.out.println("빅뱅의 index=" + index);
		list.remove(index);

		System.out.println(list.remove("방탄소년단") ? "삭제성공" : "삭제실패");
		System.out.println(list.remove("오마이걸") ? "삭제성공" : "삭제실패");
		System.out.println("===========삭제후 출력================= ");
		for (Object ob : list) {
			System.out.println(ob + " ");
		}
		System.out.println();

		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제후 객체수 " + list.size());    // 둘다 사용가능 전부 지워지기때문에 객체수 0
	}
}
