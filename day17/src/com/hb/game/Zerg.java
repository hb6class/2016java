package com.hb.game;

public class Zerg extends Unit{
	public Zerg(String name, int energy) {
		this.name = name;
		this.energy=energy;
	}
	@Override
	void decEnergy() {
		energy-=7;
	}
	
}
