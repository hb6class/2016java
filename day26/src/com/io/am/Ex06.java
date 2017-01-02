package com.io.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex06 {

	public static void main(String[] args) {
		String dir ="../../public/temp";
		File file = new File(dir,"abc.bin");
		char[] buf = new char[5];
		int a=0;	
		try {
			FileReader fr = new FileReader(file);
			a = fr.read(buf);
//			System.out.println((char)a);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0; i<buf.length; i++){
			System.out.println(buf[i]);
		}
		System.out.println(a);
	}

}






















