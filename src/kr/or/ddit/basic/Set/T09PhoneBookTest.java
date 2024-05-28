package kr.or.ddit.basic.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
문제) 이름, 주소, 전화번호 속성을 갖는 Phone클래스를 만들고, 이 Phone클래스를 이용하여 
	  전화번호 정보를 관리하는 프로그램을 완성하시오.
	  이 프로그램에는 전화번호를 등록, 수정, 삭제, 검색, 전체출력하는 기능이 있다.
	  
	  전체의 전화번호 정보는 Map을 이용하여 관리한다.
	  (key는 '이름'으로 하고 value는 'Phone클래스의 인스턴스'로 한다.)


실행예시)
===============================================
   전화번호 관리 프로그램(파일로 저장되지 않음)
===============================================

  메뉴를 선택하세요.
  1. 전화번호 등록
  2. 전화번호 수정
  3. 전화번호 삭제
  4. 전화번호 검색
  5. 전화번호 전체 출력
  0. 프로그램 종료
  번호입력 >> 1  <-- 직접 입력
  
  새롭게 등록할 전화번호 정보를 입력하세요.
  이름 >> 홍길동  <-- 직접 입력
  전화번호 >> 010-1234-5678  <-- 직접 입력
  주소 >> 대전시 중구 대흥동 111  <-- 직접 입력
  
  메뉴를 선택하세요.
  1. 전화번호 등록
  2. 전화번호 수정
  3. 전화번호 삭제
  4. 전화번호 검색
  5. 전화번호 전체 출력
  0. 프로그램 종료
  번호입력 >> 5  <-- 직접 입력
  
  =======================================
  번호   이름       전화번호         주소
  =======================================
   1    홍길동   010-1234-5678    대전시
   ~~~~~
   
  =======================================
  출력완료...
  
  메뉴를 선택하세요.
  1. 전화번호 등록
  2. 전화번호 수정
  3. 전화번호 삭제
  4. 전화번호 검색
  5. 전화번호 전체 출력
  0. 프로그램 종료
  번호입력 >> 0  <-- 직접 입력
  
  프로그램을 종료합니다...
  
*/
public class T09PhoneBookTest {
	private Scanner scan; //정의
	private Map<String, PhoneVO> phonebookMap; //정의
	
	//ket 사용자이름이니까 String
//	private Map<String, V>
		
	
	
	public T09PhoneBookTest() {
		scan = new Scanner(System.in); //초기화
		phonebookMap= new HashMap<String, PhoneVO>(); //chrlghk
	}
	
	// 메뉴를 출력하는 메서드
	public void displayMenu(){
		System.out.println();
		System.out.println("메뉴를 선택하세요.");
		System.out.println(" 1. 전화번호 등록");
		System.out.println(" 2. 전화번호 수정");
		System.out.println(" 3. 전화번호 삭제");
		System.out.println(" 4. 전화번호 검색");
		System.out.println(" 5. 전화번호 전체 출력");
		System.out.println(" 0. 프로그램 종료");
		System.out.print(" 번호입력 >> ");		
	}
	
	// 프로그램을 시작하는 메서드
	public void phoneBookStart(){
		System.out.println("===============================================");
		System.out.println("   전화번호 관리 프로그램(파일로 저장되지 않음)");
		System.out.println("===============================================");
		
		while(true){
			
			displayMenu();  // 메뉴 출력
			
			int menuNum = scan.nextInt();   // 메뉴 번호 입력
			
			switch(menuNum){
				case 1 : insert();		// 등록
					break;
				case 2 : update();		// 수정
					break;
				case 3 : delete();		// 삭제
					break;
				case 4 : search();		// 검색
					break;
				case 5 : displayAll();	// 전체 출력
					break;
				case 0 :
					System.out.println("프로그램을 종료합니다...");
					return;
				default :
					System.out.println("잘못 입력했습니다. 다시입력하세요.");
			} // switch문
		} // while문
	}
	
	// 검색
	private void search() {
		System.out.println();
		System.out.println("검색할 전화번호 정보를 입력하세요.");
		System.out.println("이 름>> ");
		String name = scan.next();
		
		PhoneVO p = phonebookMap.get(name);
		if(p==null) {
			System.out.println(name +"씨 전화번호 정보가 존재하지 않습니다.");
		}else {
			System.out.println(name+"씨의 전화번호 정보");
			System.out.println("이름: "+ p.getName());
			System.out.println("전화번호: "+ p.getTel());
			System.out.println("주소: "+ p.getAddr());
		}
		System.out.println("검색 작업 완료 ...");
	}

	// 전체 전화번호 정보 출력하기
	private void displayAll() {
		System.out.println("================================================");
		System.out.println(" 번호\t이름\t전화번호\t주소");
		System.out.println("================================================");
		
		Set<String> keySet =phonebookMap.keySet();
		
		if(keySet.size() ==0 ) { //전화번호가 없으면 X
			System.out.println("등록된 전화번호 정보가 존재하지 않습니다.");
		}else {
			Iterator<String> it = keySet.iterator();
			
			int cnt = 0;
			while(it.hasNext()) {
				cnt++;
				String name =it.next();
				PhoneVO p = phonebookMap.get(name);
				System.out.println(" " + cnt + "\t" + p.getName() + "\t"+ p.getTel()+ "\t"+ p.getAddr());
				
			}
		}
		System.out.println("===================================================");
		System.out.println("출력 완료...");
	}

	//전화번호 정보를 삭제하기 위한 메서드
	private void delete() {
		System.out.println();
		System.out.println("삭제할 전화번호 정보를 입력하세요.");
		System.out.println("이 름>> ");
		String name = scan.next();
		
		if(phonebookMap.remove(name) == null) { //등록된 사람이 아니라서안지워진거
			System.out.println(name+"씨는 등록된 사람이 아닙니다.");
		}else {
			System.out.println(name+"씨 정보가 정상적으로 삭제되었습니다.");
		}
		System.out.println("삭제 작업 완료...");
	}

	
	//회원정보를 수정하기위한 메소드
	private void update() {
		System.out.println();
		System.out.println("새롭게 수정할할 전화번호 정보를 입력하세요.");
		System.out.println("이 름>> ");
		String name = scan.next();
		
		//있는 사람인지 검사
		//get()메서드로 값을 가져올 데이터가 없으면 null을 반환
		if(phonebookMap.get(name) == null) { //수정이니까 기존에 있는사람
			System.out.println(name+"씨는 존재하지 않는 사람입니다.");
			return; //메서드 종류
		}
		System.out.println("전화번호>> ");
		
		String tel = scan.next(); //입력버퍼에 남아있는 엔티키를 제거하기 위해 실행
		
		System.out.println("주소 >> ");
		
		String addr = scan.nextLine(); //공백도 받을거라서 이거씀
		
		phonebookMap.put(name, new PhoneVO(name,tel,addr));
		System.out.println(name+ "씨 수정 완료...");
		
		
	}

	/**
	 * 회원정보를 등록하기 위한 메서드 	
	 */
	private void insert() {
		System.out.println();
		System.out.println("새롭게 등록할 전화번호 정보를 입력하세요.");
		System.out.println("이 름>> ");
		String name = scan.next();
		
		//이미 등록된 사람이지 검사하기
		//get()메서드로 값을 가져올 데이터가 없으면 null을 반환
		if(phonebookMap.get(name) != null) { //꺼내온 이름이 존재한다면
			System.out.println(name+"씨는 이미 등록된 사람입니다.");
			return; //메서드 종류
		}
		System.out.println("전화번호>> ");
		String tel = scan.next();
		
		scan.nextLine(); //입력버퍼에 남아있는 엔티키를 제거하기 위해 실행
		
		System.out.println("주소 >> ");
		String addr = scan.nextLine(); //공백도 받을거여서 이거쓴다고 하심
		
		phonebookMap.put(name, new PhoneVO(name,tel,addr));
		System.out.println(name+ "씨 등록 완료...");
		
	}

	public static void main(String[] args) {
		
		new T09PhoneBookTest().phoneBookStart();
	
	}
	
}
/*
 * 전화번호 정보를 담기 위한 Vo 클래스
 */
class PhoneVO{
	private String name;
	private String tel;
	private String addr;
	public PhoneVO(String name, String tel, String addr) {
		super();
		this.name=name;
		this.tel=tel;
		this.addr = addr;
		
	}
	public String getName() {
		return name;
	}
	//getter,setter
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//toString
	@Override
	public String toString() {
		return "PhoneVo [name=" + name + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
	
	
}


