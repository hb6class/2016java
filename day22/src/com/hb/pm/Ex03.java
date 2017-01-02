package com.hb.pm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {
		// 선입선출(FIFO : First in First Out) Queue - LinkedList
		// 후입선출(LIFO : Last in First Out) Stack
		Queue que = new LinkedList();
		que.offer("첫째"); // 마지막 요소로 추가
		que.offer("둘째");
		que.offer("셋째");
		que.offer("넷째");
		
		while(que.isEmpty()==false){
			System.out.println(que.poll()); // 꺼내오기
//			System.out.println(que.peek()); // 보고놔두기
		}
		System.out.println("---------------------------------");
		Stack st = new Stack();
		st.push("첫째");
		st.push("둘째");
		st.push("셋째");
		st.push("넷째");
		
		while(st.isEmpty()==false){
			System.out.println(st.pop());// 꺼내오기
//			System.out.println(st.peek());// 보고놔두기
		}
		
	}

}
