package com.hb.am;

// 인터페이스는 pm들이 정의
// 인덱싱 안내
interface inter01{
	void func01();
}
interface inter11{
	void func02();
}
interface inter02 extends inter01, inter11{
	int temp=100;
	void func03();
	// 필드 - 오직 상수만 (상수 변수가능) public final 생략허용
	// 메소드 - public abstract 생략허용
}
interface inter22{}
class Am02{
	public void func02(){}
//	public abstract void func03();
}
public class Ex02 extends Am02 implements inter02, inter22 {

	public static void main(String[] args) {

	}
	public void func01(){
		System.out.println(temp);
	}
	public void func03(){
	}
}
