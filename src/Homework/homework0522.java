package Homework;

import java.util.Scanner;
import java.util.TreeSet;

public class homework0522 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework0522 obj = new homework0522();
		obj.process();
	}

	public void process() {
		System.out.println("===============================");
		System.out.println("\t" + "Lotto 프로그램");
		System.out.println("-------------------------------");
		System.out.println("1. Lotto 구입");
		System.out.println("2. 프로그램 종료");
		int sel = sc.nextInt();	//스캔
 		if (sel == 1) {
			System.out.print("금액 입력: ");
			int money = sc.nextInt(); // 돈 스캔받는거
			int buy = money / 1000;   // 로또 1000원당 하나
			int changes = money% 1000;// 거스름돈

			TreeSet<Integer> lottono = new TreeSet<Integer>();

			for (int i = 0; i < buy; i++) {
				while (lottono.size() < 6) {
					int num = (int) (Math.random() * 45 + 1);
					lottono.add(num);
				}

				System.out.println("로또 번호:" + lottono);
				lottono.clear();
//				continue;

			}
			System.out.println("받은 금액: "+money+"이고 거스름돈은"+changes+"입니다.");
		} else if (sel == 2)
			System.out.println("감사합니다.");
	}

}
