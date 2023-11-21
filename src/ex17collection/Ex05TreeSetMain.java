package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString>{
	String str;
	public MyString(String str) {
		this.str = str;
	}
	public int getLength() {
		return str.length();
	}
	@Override
	public int compareTo(MyString paramStr) {
		if(getLength() > paramStr.getLength()) 
			return 1;
		else if (getLength() < paramStr.getLength())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return str;
	}
}


public class Ex05TreeSetMain {
	public static void main(String[] args) {
		
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(2);
		tree1.add(4);
		tree1.add(3);
		tree1.add(2);
		tree1.add(5);
		
		System.out.println("저장된 데이터 수 : " + tree1.size() + "개");
		
		Iterator<Integer> itr = tree1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("JavaWeb"));
		
		
		//  hasNext next iterator
		Iterator<MyString> it = tree2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
