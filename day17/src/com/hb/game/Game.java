package com.hb.game;

public class Game {

	public static void main(String[] args) {
		Unit u = new Zerg("drone", 13);
		System.out.println(u.name+":"+u.getEnergy());
		u.decEnergy();
		System.out.println(u.name+":"+u.getEnergy());
		u.decEnergy();
		System.out.println(u.name+":"+u.getEnergy());

	}

}
