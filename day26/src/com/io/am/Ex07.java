package com.io.am;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		String dir ="../../public/temp";
		File file = new File(dir,"abc.bin");
		char[] buf = "��ο�".toCharArray();
//		char[] buf = new char[5];
//		buf[0]='��';
//		buf[1]='��';
//		buf[2]='��';
//		buf[3]='��';
//		buf[4]='��';
		
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











