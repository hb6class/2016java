package com.io.pm;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("./temp1.txt");
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
//			dos.writeInt(10000);
//			dos.writeBoolean(true);
//			dos.write(5);
//			dos.writeByte(127);
//			dos.writeDouble(3.14);
//			dos.writeUTF("abc한글");// 예외적 문자열
			
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.read());
			System.out.println(dis.readByte());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
			
		} catch (Exception e) {
		} finally{
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
