package com.hb.game;

public class Terran extends Unit {
	
	public Terran(String name,int energy) {
		this.name=name;
		this.energy=energy;
	}
	@Override
	void decEnergy() {
		energy-=5;
	}
}
