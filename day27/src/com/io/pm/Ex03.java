package com.io.pm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 
		File file = new File("./temp1.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = null;
		
//		byte[] w = {1,2,3,4,76,34,124,123, 12};
		int arf = 'z'-'a'+1;
		byte[] w = new byte[arf];
		for(int a=0; a<arf; a++){
			w[a]=(byte) ('a'+a);
		}
		
		byte[] buff = new byte[512];
		int cnt =0;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file);
			baos = new ByteArrayOutputStream();
			
			baos.write(w, 0, w.length);
			byte[] by = baos.toByteArray();
			fos.write(by);
			baos.close();
			baos = new ByteArrayOutputStream();
//			System.out.println(Arrays.toString(by));
//			System.out.println(fis.available());
			int tot = fis.available();// 몇개를 읽는지...
			while((cnt=fis.read(buff,0,tot))!=-1){
				baos.write(buff,0,cnt);
			}
//			System.out.println(Arrays.toString(baos.toByteArray()));
			byte[] re = baos.toByteArray();
			for(int i=0; i<baos.size(); i++){
				System.out.print((char)re[i]);
			}
		} catch (Exception e) {
		}
	}

}













