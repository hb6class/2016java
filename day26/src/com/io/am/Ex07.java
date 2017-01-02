package com.io.am;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		String dir ="../../public/temp";
		File file = new File(dir,"abc.bin");
		char[] buf = "Çï·Î¿ì".toCharArray();
//		char[] buf = new char[5];
//		buf[0]='¾È';
//		buf[1]='³ç';
//		buf[2]='ÇÏ';
//		buf[3]='¼¼';
//		buf[4]='¿ä';
		
		FileWriter fw= null;
		try {
			fw = new FileWriter(file);
			fw.write(buf);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}











