package com.hb.am;

class ATM2 implements Runnable{
	int money;
	
	public ATM2() {this.money=0;}
	
	@Override
	public void run() {
		add(1000);
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		del(500);
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		del(300);
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		del(200);
	}
//	synchronized void add(int money){
//		this.money+=money;
//		System.out.println("cd입금-"+money+"원, 은행잔고:"+this.money+"원");
//	}
//	synchronized void del(int money){
//		if(this.money>=0 && this.money>=money){
//				this.money -=money;
//				System.out.println("cd출금-"+money+"원, 은행잔고:"+this.money+"원");
//		}else{
//			System.out.println("잔고 부족");
//		}
//	}
	////////////////////////////////
	void add(int money){
		synchronized (this) {
			this.money+=money;
			System.out.print(Thread.currentThread().getName());
			System.out.println(":cd입금-"+money+"원, 은행잔고:"+this.money+"원");
		}
	}
	void del(int money){
		synchronized (this) {
			if(this.money>=0 && this.money>=money){
				this.money -=money;
				System.out.print(Thread.currentThread().getName());
				System.out.println(":cd출금-"+money+"원, 은행잔고:"+this.money+"원");
			}else{
				System.out.println("잔고 부족");
			}
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		ATM2 bank = new ATM2();
		System.out.println("잔고:"+bank.money+"원");
		Thread atm1 = new Thread(bank,"ATM1");
		Thread atm2 = new Thread(bank,"ATM2");
		Thread atm3 = new Thread(bank,"ATM3");
		atm1.start();
		atm2.start();
		atm3.start();
		try {
			atm1.join();
			atm2.join();
			atm3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("잔고:"+bank.money+"원");
	}

}