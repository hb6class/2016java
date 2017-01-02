package com.hb.pm;

import java.io.IOException;
import java.util.Date;

public class Ex06 {

	public static void main(String[] args){
		for(int i=0; i<10; i++){
			try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}catch(Exception e){}
			Date date = new Date();
			System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		try {
//			Runtime.getRuntime().exec("cls");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
