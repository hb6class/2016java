package com.hb.am;


class BankDB{
	int money;
	BankDB(int money){
		this.money = money;
	}
	//�Ա�
	void input(int money){
		this.money+=money;
	}
	//���
	int output(int money){
		if(this.money>=money){
			this.money-=money;
			return money;
		}else{
			return 0;
		}
	}
}

class Bank extends BankDB{
	Bank(int money){
		super(money);
	}
	void saveMoney(int money){
		input(money);
		System.out.println("�����ܰ�:"+super.money);
	}
	void getMoney(int money){
		int won = output(money);
		if(won==0){
			System.out.println("��� ����");
		}else{
			System.out.println("�����ܰ�:"+super.money);
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Bank bank = new Bank(1000);
		bank.saveMoney(10000);
		bank.getMoney(5000);
		bank.getMoney(5000);
		bank.getMoney(5000);
		bank.getMoney(1000);
	}

}
