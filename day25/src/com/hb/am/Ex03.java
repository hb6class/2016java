package com.hb.am;

class Bank{
	int money;
	public Bank() {
		money=0;
	}
	synchronized void add(int money){
		this.money+=money;
		System.out.println("cd입금-"+money+"원, 은행잔고:"+this.money+"원");
	}
	synchronized void del(int money){
		if(this.money>=0 && this.money>=money){
				this.money -=money;
				System.out.println("cd출금-"+money+"원, 은행잔고:"+this.money+"원");
		}else{
			System.out.println("잔고 부족");
		}
	}
}

class ATM extends Thread{
	Bank bank;
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		bank.add(1000);
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bank.del(500);
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bank.del(300);
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bank.del(200);
	}
	
	////////////////////////////////
//	void add(int money){
//		synchronized (bank) {
//			this.bank.money+=money;
//			System.out.println("cd입금-"+money+"원, 은행잔고:"+this.bank.money+"원");
//		}
//	}
//	void del(int money){
//		synchronized (bank) {
//			if(this.bank.money>=0 && this.bank.money>=money){
//				this.bank.money -=money;
//				System.out.println("cd출금-"+money+"원, 은행잔고:"+this.bank.money+"원");
//			}else{
//				System.out.println("잔고 부족");
//			}
//		}
//	}
}


public class Ex03 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("잔고:"+bank.money+"원");
		ATM atm1 = new ATM(bank);
		ATM atm2 = new ATM(bank);
		ATM atm3 = new ATM(bank);
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














