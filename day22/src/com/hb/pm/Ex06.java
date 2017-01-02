package com.hb.pm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

class Ball{
	int num;
	Ball(int num){
		this.num=num;
	}
	
	@Override
	public boolean equals(Object obj) {
		return num==((Ball)obj).num;
	}
	@Override
	public int hashCode() {
		return num;
	}
}


public class Ex06 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		int cnt = 0;
		while(set.size()<7){
			cnt++;
			Random ran = new Random();
			int random = ran.nextInt(45)+1;
			set.add(new Ball(random));
		}
		System.out.println(cnt-6+"번 중복을 처리하였습니다");
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			Ball ball = (Ball)ite.next();
			System.out.print(ball.num+" ");
		}
	}

}
