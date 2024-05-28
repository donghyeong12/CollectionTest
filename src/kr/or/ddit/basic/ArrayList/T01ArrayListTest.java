package kr.or.ddit.basic.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T01ArrayListTest {
	public static void main(String[] args) {

		// Default Capacity =10 → 기본 10이다
		// 더크게 만들고싶으면 ArrayList(100) <100 넣으면 크게 만들수있음
		List list1 = new ArrayList();

		// add() 메서드를 사용하여 데이터를 추가한다.
		list1.add("aaa");
		list1.add("bbb");
		list1.add(new Integer(111));
		list1.add('k');
		list1.add(true);
		list1.add(12.34);
//		list1.add(7);
//		list1.add(8);
//		list1.add(9);
//		list1.add(10);
//		list1.add(11);
//		list1.add(12);
//	

		// size() => 데이터 개수
		System.out.println("size = > " + list1.size());
		System.out.println("list1=>" + list1);
		System.out.println("--------------------------------------------");
		// get() 으로 데이터 가져오기
		System.out.println("1번째 데이터: " + list1.get(0));
		System.out.println("--------------------------------------------");
		// 데이터 끼워넣기
		list1.add(0, "zzz");
		System.out.println("zzz 끼워넣기 후: " + list1);
		System.out.println("--------------------------------------------");
		// 데이터 변경하기
		String temp = (String) list1.set(0, "YYY");
		System.out.println("temp: " + temp);
		System.out.println("첫번째 데이터를 YYY로 데이터를 변경 한 후: : " + list1);
		System.out.println("--------------------------------------------");
		// 데이터 삭제
		list1.remove(0);
		System.out.println("첫번째 데이터 삭제 후: " + list1);

		list1.remove("bbb");
		System.out.println("bbb 데이터 삭제 후: " + list1);
		System.out.println("-------------------------------");

//		list1.remove(1); //위치를 알면 값의 위치 
		list1.remove(new Integer(111)); // 위치를 모를때는 값쓰기 단 !111하면 인덱스로 인식하기떄문에 111 int 타입이라서 Integer
		System.out.println("111 데이터 삭제 후 : " + list1);

		// 제너릭을 사용하여 선언할 수 있다.
		List<String> list2 = new ArrayList<String>();
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");

		for (String str : list2) {
			System.out.println(str);
		}
		System.out.println("--------------------------------------------");

		// contauns(비교객체) => 리스트에 '비교객체'가 존재하면 ture, 없으면 false 리턴함.
		// Contauns => 포함하다. 리턴값이: ture 아님 false
		System.out.println(list2.contains("DDD"));
		System.out.println(list2.contains("ZZZ"));

		// indexof(비교객체) => 리스트에서 '비교객체'를 찾아 존재하는 인덱스값을 반환한다.
		// 존재하지 않으면 -1을 반환한다.
		System.out.println("DDD의 index값: " + list2.indexOf("DDD"));
		System.out.println("ZZZ의 index값: " + list2.indexOf("ZZZ"));
		System.out.println("---------------------------------------------");

		for (int i = 0; i < list2.size(); i++) { // list2 사이즈 길이만큼
			list2.remove(0); // 0번째 :AAA 지워지면 BDE /1번째 DDD 지워지면 BE / 2번은 비워있음 3번도 비워있음 4번도 5번도
								// 그러므로 BE 남아서 2개가남음
		}
		System.out.println("list2의 개수: " + list2.size()); // 다 안지워지고 2개남는이유
	}
}
