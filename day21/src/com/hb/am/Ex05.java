package com.hb.am;

class Am05 extends Exception{
	public Am05() {
		super("내가 만든 에러");
	}
	@Override
	public String toString() {
		return "오류 메시지";
	}
	public void func01(){
		System.out.println("이렇게도 가능");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Ex05 me = new Ex05();
		try{
			me.func01(0);
			System.out.println("여기까지 수행");
		}catch (Am05 e) {
			e.func01();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	void func01(int a) throws Exception {
//		System.out.println(3/0);
		Am05 ex = new Am05();
		throw ex;
	}
}
