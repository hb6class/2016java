package com.io.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex05 {

	public static void main(String[] args) {
		String dir ="../../public/temp";
		File file = new File(dir,"abc.bin");
//		byte[] buf = new byte[3];
//		buf[0]=1;
//		buf[1]=2;
//		buf[2]=3;
		byte[] buf = "자바".getBytes();
		System.out.println("자바 글자 바이트길이:"+buf.length);
		for(int i=0; i<buf.length; i++){
			System.out.println(buf[i]);
		}
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(file);
//			int a=4;
			fos.write(buf);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
