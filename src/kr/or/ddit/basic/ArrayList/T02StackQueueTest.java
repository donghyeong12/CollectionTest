package kr.or.ddit.basic.ArrayList;

import java.util.LinkedList;

public class T02StackQueueTest {
	public static void main(String[] args) {
		// STACK 방식
		// stack 넣을때는 1 > 2 > 3 > 4 > 5
		// stack 뺄때는 5 > 4 > 3 > 2 > 1
		// LIFO

		// Queue (은행업무 생각 먼저온사람부터 )
		// 넣을때1>2>3>4
		// 뺄떄   1>2>3>4
		// FIFO
		LinkedList<String> stack = new LinkedList<String>();
		/*
		 * stack 명령 1) 데이터 추가: push(저장할값) 2) 데이터 꺼내기: pop() => 데이터를 꺼내온 후 꺼내온 데이터를
		 * stack에서 제거한다.(팝콘 터져나온다)
		 */

		stack.push("1.홍길동");
		stack.push("2.일지매");
		stack.push("3.변학도");
		stack.push("4.강감찬");
		System.out.println("현재 stack값들: " + stack); // 1등:홍길동,2등:일지매,3:변학도,4:강감찬

		String date = stack.pop();
		System.out.println("꺼내온 데이터: " + date);// 마지막에 들어왔으니까 강감찬부터
		System.out.println("꺼내온 데이터: " + stack.pop());
		System.out.println("꺼내온 데이터: " + stack);

		stack.push("성춘향");
		System.out.println("현재 stack값들: " + stack);
		System.out.println("꺼내온 데이터: " + stack.pop());
		System.out.println("--------------------------------------");
		System.out.println();

		LinkedList<String> queue = new LinkedList<String>();
		/*
		 * Queue 방식 처리를 위한 명령 1) 데이터 추가: offer(저장할값) 2) 데이터 꺼내기: poll() => 데이터를 Queue에서
		 * 꺼내온 후 Queue에서 삭제.
		 */
		queue.offer("1.홍길동");
		queue.offer("2.변학도");
		queue.offer("3.일지매");
		queue.offer("4.강감찬");

		System.out.println("현재 queue의 값: " + queue);

		String temp = queue.poll();
		System.out.println("꺼내온 데이터: " + temp);
		System.out.println("꺼내온 데이터: " + queue.poll());
		System.out.println("현재 queue의 값:" + queue);

		if (queue.offer("5.성춘향")) {
			System.out.println("신규 등록 데이터: 성춘향");
		}
		System.out.println("현재 queue의 값: " + queue);
		System.out.println("꺼내온 데이터: " + queue.poll());

	}
}
