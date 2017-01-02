package com.hb.pm;

class Pm05 extends Thread{
	// ~p.641
	Pm05 me;
	
	public Pm05(String name) {
		super(name);
	}
	void setMe(Pm05 me){
		this.me = me;
	}
	@Override
	public void run() {
		try {
			if(me!=null)me.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName()+"스레드 순위:"+this.getPriority());
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Pm05 me1 = new Pm05("1번");
		Pm05 me2 = new Pm05("2번");
		Pm05 me3 = new Pm05("3번");
		
//		me1.setPriority(1);	// D:5 1(낮음)~10(높음)
//		me2.setPriority(5);
//		me3.setPriority(10);
		me1.setPriority(Thread.MIN_PRIORITY);	// 최저순위
		me2.setPriority(Thread.NORM_PRIORITY);	// 보통순위
		me3.setPriority(Thread.MAX_PRIORITY);	// 최고순위
		
		me1.start();
		me2.setMe(me1);
		me2.start();
		me3.setMe(me2);
		me3.start();
		
		
//		try {
//			me1.join();
//			me2.join();
//			me3.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("main end");
	}

}















