package ex17collection;
//  저장순서 유지 X





import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		//객체저장
		//  처음 입력이라면 null값
		System.out.println("=======name이라는 키값으로 저장된 이전의 값:"+ map.put("name", "홍길동"));
		
		int number = 20;
//		map.put("age", number);   String 이기 때문에 
		map.put("age", String.valueOf(number));   //  숫자를 문자열로 변경한후 넣은것 가능!
		map.put("gender", "남자");
		map.put("address","가산디지털단지");
		System.out.println("========저장된 객체수:"+ map.size());   // 홍길동 number 남자 가산 4개 
		
		//중복저장
		
		System.out.println("name이라는 키값으로 저장된 이전의 값:"+ map.put("name", "최길동"));   // name이라는 같은 키값에 홍길동 대신 최길동 덮어쓰기
		System.out.println("키값으로 중복 저장후 객체수:"+ map.size());
		
		// 출력하기
		//	1.키값을 알고있을때
		System.out.println("키값을 알때: " + map.get("name"));
		
		// 2.키값을 모를때
		System.out.println("##########키값모를때#############");
		Set<String> keys = map.keySet();    // 키값을 먼저 받아온후에 for문적용 
		System.out.println("확장for문 적용");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s : %s",key, value));
		}
		
		//이터레이터를 통한 출력
		System.out.println("이터레이터 사용하기");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next(); // 키값얻기
			String value = map.get(key);
			System.out.println(String.format("%s : %s", key, value));
		}
		
		//Value만 얻어와야 할때   
		System.out.println("value값들만 출력하기");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		System.out.println(map.containsKey("name")?" name키값있다." : "name키값없다");
		System.out.println(map.containsKey("account")?" account키값있다." : "account키값없다");
		System.out.println(map.containsValue("남자")?" 남자있다." : "남자없다");
		System.out.println(map.containsValue("여자")?" 여자있다." : "여자없다");
		
		// 키값을 통해 삭제 
		System.out.println("삭제된 객체:" + map.remove("age"));
		System.out.println("===========age키값을 삭제후 출력==========");
		for(String key : keys) {   //  
			System.out.println(String.format("%s : %s", key, map.get(key)));
		}
		
		map.clear();  //  전체삭제 이렇게만 가능 clear로만
		System.out.println("전체삭제후 객체수 : " + map.size());
		
	}

}
