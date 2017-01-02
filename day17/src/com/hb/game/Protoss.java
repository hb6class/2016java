package com.hb.game;

public class Protoss extends Unit {
	
	public Protoss(String name, int energy) {
		this.name = name;
		this.energy=energy;
	}
	
	@Override
	void decEnergy() {
		energy-=6;
	}

}
