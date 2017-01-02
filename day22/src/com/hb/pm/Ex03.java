package com.hb.pm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {
		// ���Լ���(FIFO : First in First Out) Queue - LinkedList
		// ���Լ���(LIFO : Last in First Out) Stack
		Queue que = new LinkedList();
		que.offer("ù°"); // ������ ��ҷ� �߰�
		que.offer("��°");
		que.offer("��°");
		que.offer("��°");
		
		while(que.isEmpty()==false){
			System.out.println(que.poll()); // ��������
//			System.out.println(que.peek()); // ������α�
		}
		System.out.println("---------------------------------");
		Stack st = new Stack();
		st.push("ù°");
		st.push("��°");
		st.push("��°");
		st.push("��°");
		
		while(st.isEmpty()==false){
			System.out.println(st.pop());// ��������
//			System.out.println(st.peek());// ������α�
		}
		
	}

}
