package com.io.am;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class Ex01 {

	public static void main(String[] args) {
//		InputStream input = System.in;
//		2e0=1;
//		2e1=2;
//		2e2=4;
//		2e3=8;
//		2e4=16;
//		2e5=32;
//		2e6=64;
//		2e7=128;
//		2e8=256;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int a=0;
		byte[] buff1 = new byte[15];
		
		for(int i=0; i<buff1.length; i++){
			buff1[i]=(byte) a++;
		}
		byte[] buff2 = new byte[10];
		try {
			File file = new File("./temp1.txt");
			if(!file.exists())file.createNewFile();
			
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file);
			fos.write(buff1);// 아스키코드값
//			int cnt=fis.read(buff2);
			int cnt=0;
			while((cnt=fis.read(buff2))!=-1){
				for(int m=0; m<cnt; m++){
					System.out.print(buff2[m]+" ");
				}
			}
//			System.out.println(Arrays.toString(buff2));
//			for(int m=0; m<cnt; m++){
//				System.out.print(buff2[m]+" ");
//			}
		} catch (Exception e) {
		} finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
			}
		}
	}

}















