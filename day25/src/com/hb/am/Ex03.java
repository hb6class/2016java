package com.hb.am;

class Bank{
	int money;
	public Bank() {
		money=0;
	}
	synchronized void add(int money){
		this.money+=money;
		System.out.println("cd�Ա�-"+money+"��, �����ܰ�:"+this.money+"��");
	}
	synchronized void del(int money){
		if(this.money>=0 && this.money>=money){
				this.money -=money;
				System.out.println("cd���-"+money+"��, �����ܰ�:"+this.money+"��");
		}else{
			System.out.println("�ܰ� ����");
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
//			System.out.println("cd�Ա�-"+money+"��, �����ܰ�:"+this.bank.money+"��");
//		}
//	}
//	void del(int money){
//		synchronized (bank) {
//			if(this.bank.money>=0 && this.bank.money>=money){
//				this.bank.money -=money;
//				System.out.println("cd���-"+money+"��, �����ܰ�:"+this.bank.money+"��");
//			}else{
//				System.out.println("�ܰ� ����");
//			}
//		}
//	}
}


public class Ex03 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("�ܰ�:"+bank.money+"��");
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
		System.out.println("�ܰ�:"+bank.money+"��");
	}

}














