package com.io.am;

import java.io.File;
import java.io.FileInputStream;

public class Ex04 {

	public static void main(String[] args) {
		String dir ="../../public/temp";
		File file = new File(dir,"abc.bin");
		FileInputStream fis= null;
		int a=0;//4바이트
		byte[] buf= new byte[10];
		try {
			fis = new FileInputStream(file);//1바이트
			a = fis.read(buf);
//			while(true){
//				a = fis.read();
//				if(a==-1)break;
//				System.out.println(a);
//			}
			String st = new String(buf);
			System.out.println(st);
		}catch (Exception e){}
//		for(int i=0; i<buf.length; i++){
//			System.out.print(buf[i]+",");
//		}
	}
}
