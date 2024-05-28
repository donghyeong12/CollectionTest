package Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class homework0523 {
	private Scanner scan;
	private Map<Integer, HotelVo> HotelMap;

	
	
	public homework0523() {
		scan = new Scanner(System.in);
		HotelMap = new HashMap<Integer, HotelVo>();
	}

	public void HotelMenu() {
		System.out.println();
		System.out.println("*메뉴 선택*");
		System.out.println("1. 체크인");
		System.out.println("2. 체크아웃");
		System.out.println("3. 객실상태");
		System.out.println("4. 업무종료");
		System.out.print(" 번호선택 >>");

	}

	public void HotelStart() {
		System.out.println("**********************************");
		System.out.println("          호텔 문을 열었습니다.       ");
		System.out.println("**********************************");

		while (true) {

			HotelMenu(); // 메뉴 출력

			int menuNum = scan.nextInt();

			switch (menuNum) {
			case 1:
				checkin();
				break;
			case 2:
				checkout();
				break;
			case 3:
				hotellist();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
	//방 리스트 조회
	private void hotellist() {
		System.out.println("────────────────────────");
		System.out.println("객실번호\t이름");
		System.out.println("────────────────────────");
	
		Set<Integer> keySet = HotelMap.keySet();
		
		if(keySet.size()==0) {
			System.out.println("등록된 예약 정보가 존재하지 않습니다. ");
		}else {
			Iterator<Integer> it = keySet.iterator();
			
			while(it.hasNext()) {
				int no = it.next();
				HotelVo h = HotelMap.get(no);
				System.out.println(h.getNo()+"\t"+h.getName());
			}
		}
		System.out.println("────────────────────────");
	}
		//체크아웃
	private void checkout() {
		System.out.println();
		System.out.println("삭제할 객실번호을 입력하세요.");
		System.out.println("객실번호>> ");
		int no =scan.nextInt();
		
		if(HotelMap.remove(no)==null) {
			System.out.println(no+"번은 등록된 객실이 아닙니다.");
		}else {
			System.out.println(no+"객실 예약이 정상적으로 삭제되었습니다.");
		}
	}

		//체크인
	private void checkin() {
		System.out.println();
		System.out.println("어느방에 체크인하시겠습니까?");
		System.out.print("방번호>>");
		int no =scan.nextInt();
		
		//방번호 중복체크
		if(HotelMap.get(no) !=null) { 
			System.out.println(no+" 방번호는 등록된 객실 입니다.");
		}
		HotelVo h = HotelMap.get(no);
		if(h==null) {
			System.out.println("누구를 체크인 하시겠습니까?");
			System.out.print("이름>> ");
			
			String name = scan.next();
			
			HotelMap.put(no, new HotelVo(no, name));
			System.out.println(name+" 님 체크인 완료");
			
		}
		
	}
	public static void main(String[] args) {
		new homework0523().HotelStart();
	}
}
	
class HotelVo {
	private int no;
	private String name;
	public HotelVo(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HotelVo [no=" + no + ", name=" + name + "]";
	}

}
