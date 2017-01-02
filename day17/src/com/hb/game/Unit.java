package com.hb.game;
// 스타
// 3가지 종족
abstract public class Unit {
	String name;
	int energy; // 테란(scv)-5>프로토스(프루브)-6>저그(드론)-7
	
	abstract void decEnergy();
	
	int getEnergy(){
		return this.energy;
	}
}
