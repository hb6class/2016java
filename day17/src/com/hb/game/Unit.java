package com.hb.game;
// ��Ÿ
// 3���� ����
abstract public class Unit {
	String name;
	int energy; // �׶�(scv)-5>�����佺(�����)-6>����(���)-7
	
	abstract void decEnergy();
	
	int getEnergy(){
		return this.energy;
	}
}
