package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex06Define1Predicate {

	public static void main(String[] args) {
		
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
	
	Predicate<Human> pre = (Human h) -> {
		return h.getGender().equals("남");
	};
	
	System.out.println("p.test(p1) =>" + pre.test(p1));
	System.out.println("p.test(p2) =>" + pre.test(p2));
	
	List<Human> list1 = Arrays.asList(p1,p2,p3,p4);
	double maleAvg =

	avg((Human h) -> h.getGender().equals("남"),list1);
	
	System.out.println("남자평균:" + maleAvg);
	
	}

	public static double avg(Predicate<Human> ph, List<Human> li) {
		int pCount = 0;
		int tCount = 0;
		for(Human h : li) {
			if(ph.test(h)==true) {
				pCount++;
			tCount += h.getScore();
		}
	}return(double)tCount/pCount;
	}
}