package com.hb.am;

class Man{	// ��� Ŭ����
	String name;
	Man(String name){
		this.name=name;
	}
	void callByName(){
		System.out.println("����"+name+"�Դϴ�");
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
		System.out.println("����"+name+"�Դϴ�");
	}
	void yourPhone(){
		System.out.println(tel+"�Դϴ�");
	}
	void yourComp(){
		System.out.println(comp+"�� �ٹ����Դϴ�");
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
//		BMan man1 = new BMan("ȫ�浿","010-1111-2222","�Ѻ�");
//		man1.callByName();
//		man1.yourPhone();
//		man1.yourComp();
//		System.out.println("-------------------------------");
//		BMan man2 = new BMan("ȫ����","010-9999-8888","�Ѻ�ENI","������ȫ");
//		man2.info();
////		man2.callByName();
//		System.out.println("-------------------------------");
//		Sol sol = new Sol("������","�̺�");
//		sol.callbySol();
		
		// ������
		Man man = new Man("ȫ�浿");
//		man.callByName();
		man = new Sol("����","����");
//		man.callByName();
		Object obj = new Man("ȫ�浿");
		obj = new Sol("����","����");
		((Sol)obj).callbySol();
//		man= new BMan("ȫ����","010-9999-8888","�Ѻ�ENI","������ȫ");
//		man.callByName();
	}

}








