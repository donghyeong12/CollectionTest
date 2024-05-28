package kr.or.ddit.basic.Set;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class T10PropertiesTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
	      
	      prop.setProperty("name", "홍길동");
	      prop.setProperty("tel", "010-1234-5678");
	      prop.setProperty("addr", "대전");

	      String name = prop.getProperty("name");
	      String tel= prop.getProperty("tel");
	      
	      System.out.println("이름: "+name);
	      System.out.println("전화: "+tel);
	      System.out.println("이름: "+prop.getProperty("addr"));
	      
	      //prop.store(new FileOutputStream("src/kr/or/ddit/basic/Set/test.properties"), "코멘트(Comment)");
	      
	      //Properise파일 읽어오기
	      prop.load(new FileReader("src/kr/or/ddit/basic/Set/test.properties"));
	      
	      System.out.println("읽어온 정보 출력..");
	      System.out.println(prop.getProperty("language"));
	}
//	private static void mian(String[] args) throws FileNotFoundException, IOException {
//	/*
//		Properties는 Map보다 축소된 기능의 객체라고 할 수 있다.
//		Map은 모든 형태의 객체데이터를 Key와 Value로 사용할 수 있지만
//		Properties는 key와 value값으로 String 타입만 사용할 수 있다.
//	 */
//		Properties prop = new Properties();
//		
//		prop.setProperty("name", "홍길동");
//		prop.setProperty("tel", "010-1234-5678");
//		prop.setProperty("addr", "대전");
//
//		String name = prop.getProperty("name");
//		String tel= prop.getProperty("tel");
//		
//		System.out.println("이름: "+name);
//		System.out.println("전화: "+tel);
//		System.out.println("이름: "+prop.getProperty("addr"));
//		
//		//데이터를 파일로 저장하기 
//		//에러났는데 예외처리로 던저버림
//		prop.store(new FileOutputStream("src/kr/or/ddit/basic/Set/test.properties"), "코멘트(Comment)");
//	}
}
