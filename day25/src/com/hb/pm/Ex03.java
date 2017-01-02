package com.hb.pm;

class Pm03 extends Thread{
	@Override
	public void run() {
		int sum=0;
		System.out.println("실행중");
		System.out.println("Pm03 start");
		for(int i=0; i<Integer.MAX_VALUE; i++){
			sum += i*i;
		}
		System.out.println("실행중끝");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("실행중");
		for(int i=0; i<Integer.MAX_VALUE; i++){
			sum += i*i;
		}
		System.out.println("실행중끝");
		System.out.println("Pm03 end");
	}
}

class ViewThread extends Thread{
	Pm03 pm03;
	public ViewThread(Pm03 pm03) {
		this.pm03 = pm03;
	}
	@Override
	public void run() {
		System.out.println("view start");
		while(true){
			State state = pm03.getState();
			if(state == Thread.State.NEW){
				pm03.start();
			}else if(state == Thread.State.RUNNABLE){
				System.out.println("runnable 상태");
			}else if(state == Thread.State.TIMED_WAITING){
				System.out.println("대기상태");
			}else if(state == Thread.State.TERMINATED){
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("view end");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Pm03 pm03 = new Pm03();
		ViewThread me = new ViewThread(pm03);
		me.start();
	}

}
