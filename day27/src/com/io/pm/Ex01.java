package com.io.pm;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) {
		//
		File file = new File("./temp1.txt");
		FileOutputStream fos = null;
		DataOutputStream dos = null;// 기본자료형
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			dos.writeInt(10000);
			dos.writeBoolean(true);
			dos.write(5);
			dos.writeByte(127);
			dos.writeDouble(3.14);
			dos.writeUTF("abc한글");// 예외적 문자열
			
		} catch (Exception e) {
		} finally{
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}

}













