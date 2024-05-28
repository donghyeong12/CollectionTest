package kr.or.ddit.basic.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T03ListSortTest {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("일지매");
		list.add("홍길동");
		list.add("성춘향");
		list.add("변학도");
		list.add("이순신");
		System.out.println("정렬 전: " + list);

		// 정렬은 Collections.sort() 메서드를 이용하여 정렬
		// 정렬은 기본적으로 '오름차순 정렬'을 수행
		// ㄱㄴㄷㄹ순으로 (오름차순 작은거→큰거순)
		// 영어는 (A~Z) 즉 문자는 사전순서
		Collections.sort(list);
		System.out.println("정렬 후: " + list);

		Collections.shuffle(list); // shuffle 섞기..
		System.out.println("섞은 후: "+list);
		
		Collections.sort(list,new Desc());
		System.out.println("외부정렬자를 이용한 정렬 후:"+list);
		
		// Collections.sort //*compare 타입객체가 필요?*

	}
}

// 내림차순을 원함
class Desc implements Comparator<String> {
	/*
	 * compare()메서드의 반환값을 결정하는 방법
	 * - 오름차순 정렬일 경우 =>앞이 값이 크면 양수, 같으면0, 작으면 음수를 반환
	 */
	
	@Override
	// compara (1, 2) 비교
	// reture 1.compareTo(2)
	public int compare(String str1, String str2) {
//		return str1.compareTo(str2);    //오름차순
		return str1.compareTo(str2)*-1; //내림차순
	}

}
