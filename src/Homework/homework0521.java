package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class homework0521 {
	public static void main(String[] args) {

		List<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student("STD121", "이동형", 100, 95, 100));
		stdList.add(new Student("STD142", "김대동", 75, 95, 80));
		stdList.add(new Student("STD133", "박번동", 75, 100, 90));
		stdList.add(new Student("STD124", "한당동", 100, 100, 90));
		stdList.add(new Student("STD115", "임대덕", 95, 80, 90));
		stdList.add(new Student("STD126", "조인재", 90, 50, 80));
		stdList.add(new Student("STD128", "서개발", 90, 55, 90));
		stdList.add(new Student("STD129", "박원", 75, 75, 80));

		System.out.println("정렬전: ");
		for (Student stu : stdList) {
			System.out.println(stu);
		}
		System.out.println("========================================================================");

		Collections.sort(stdList);
		System.out.println("학번 오름차순 정렬: ");
		for (Student std : stdList) {
			System.out.println(std);
		}
		System.out.println("========================================================================");

		Collections.sort(stdList, new stdSumDesc());
		System.out.println("총점 내림차순 정렬: ");
		int grade = 1;
		for (Student std : stdList) {
//			std.setgrade(grade)++;
			std.setGrade(grade++);
			System.out.println(std);
		}
		System.out.println("======================================================================");
	}

}

//총점  내림차순 (총점이같으면 학번 내림차순으로)
class stdSumDesc implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
//		if (std1.getSum() > std2.getSum()) {
//			return -1;
//		} else if (std1.getSum() == std2.getSum()) {
////			if(std1.getNo()>std2.getNo()) {
////				return -1;
////			}
//		}else {
//			return 1;
//		}
		if(std1.getSum() >std2.getSum()) {
			return-1;
		}else if(std1.getSum()==std2.getSum()) {
			return std1.getNo().compareTo(std2.getNo())*-1;
		}else {
			return 1;
		}

//		return Integer.compare(std1.getSum(), std2.getSum())*-1;//std1 <std2 비교해서	

	}

}

//comparable 학번순으로 오름차순
class Student implements Comparable<Student> {
	private String no;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private int grade;

	public Student(String no, String name, int kor, int math, int eng) {
		super();
		// alt+s → generate coustructor using
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = kor + math + eng;
		this.grade = grade;

	}// alt+s → generate getter,setter

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// alt+s → generate tostring
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", sum="
				+ sum + ", grade=" + grade + "]";
	}

	// comparable 학번순으로 오름차순
	@Override
	public int compareTo(Student stu) {
		return this.getNo().compareTo(stu.getNo()); //오름차순
	}

}
