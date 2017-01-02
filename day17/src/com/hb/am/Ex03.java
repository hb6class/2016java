package com.hb.am;

class Man{	// 사람 클래스
	String name;
	Man(String name){
		this.name=name;
	}
	void callByName(){
		System.out.println("나는"+name+"입니다");
	}
	
}

class Sol extends Man{
	String tree;
	Sol(String name, String tree){
		super(name);
		this.tree = tree;
	}
	void callbySol(){
		System.out.print(tree+",");
		callByName();
	}
}

class BMan extends Man{
	String tel;
	String comp;
	String name;
	
	BMan(String name, String tel, String comp){
		super(name);
		this.tel = tel;
		this.comp = comp;
	}
	BMan(String name, String tel, String comp, String newName){
		this(name,tel,comp);
		this.name = newName;
	}
	void callByName(){
		System.out.println("나는"+name+"입니다");
	}
	void yourPhone(){
		System.out.println(tel+"입니다");
	}
	void yourComp(){
		System.out.println(comp+"에 근무중입니다");
	}
	void info(){
		super.callByName();
		this.yourPhone();
		this.yourComp();
	}
	
}



public class Ex03 {

	public static void main(String[] args) {
		//~~~~~~
//		BMan man1 = new BMan("홍길동","010-1111-2222","한빛");
//		man1.callByName();
//		man1.yourPhone();
//		man1.yourComp();
//		System.out.println("-------------------------------");
//		BMan man2 = new BMan("홍길자","010-9999-8888","한빛ENI","제니퍼홍");
//		man2.info();
////		man2.callByName();
//		System.out.println("-------------------------------");
//		Sol sol = new Sol("유승준","이병");
//		sol.callbySol();
		
		// 다형성
		Man man = new Man("홍길동");
//		man.callByName();
		man = new Sol("가일","병장");
//		man.callByName();
		Object obj = new Man("홍길동");
		obj = new Sol("가일","병장");
		((Sol)obj).callbySol();
//		man= new BMan("홍길자","010-9999-8888","한빛ENI","제니퍼홍");
//		man.callByName();
	}

}








