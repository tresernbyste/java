package ex17collection;
//HashSet<E>  Set 꼐열의 컬렉션 
//Set 계열의 인터페이스를 구현한 컬렉션
//객체가 순서없이 저장된다ㅣ.
//list 배열의 특성  Set은 집합의 특성

//  list 와 set을 구분 정리 
// 



import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100;  // 
		Teacher varTeacher = new Teacher("김봉두 ", 55, "체육");
		
		
		// 객체 저장
		
		System.out.println("add결과 " + set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		
		
		
		System.out.println("중복저장전 객체수"+ set.size());
		
		System.out.println(set.add(varString2)? "저장성공": "저장실패");  //varString은 같은 동일한 문자열이 있음
		System.out.println("중복 저장후 객체수"+ set.size());
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			if(object  instanceof Teacher) {
				System.out.println("==Teacher객체 =="+ ((Teacher)object).getName());
				
			}
			else {
				System.out.println("저장된 객체:" + object);
			}
		}//end of while
		
		System.out.println(set.contains(varString1)? "varString 있음": "varString 없음");
		
		System.out.println(set.remove(varString2)?"varStirng2 삭제 성공": "varString2 삭제 실패");
		
		
//		set.clear();
//		전체삭제는 list 컬렉션과 동일		
		System.out.println("전첵삭제"+ set.removeAll(set));
		System.out.println("전체삭제후 객체수 "+ set.size());
		
		
		
		
	}
	

}
