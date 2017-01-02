package com.hb.pm2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Ex01 {
	
	public static void main(String[] args) {
		// IO
		System.out.println("main start");
		InputStream input = System.in;
		PrintStream output = System.out;//¹öÆÛ
		int temp=0;
		String temp2="";
		int temp3=0;
		while(true){
			try {
				temp = input.read();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				temp2+=(temp3++);
			}
		if(temp==-1)break;// "\r\n"
		output.write(temp);//
		}
		System.out.println(temp2);
	}

}












