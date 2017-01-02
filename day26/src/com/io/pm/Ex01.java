package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex01 {

	public static void main(String[] args) {
		PrintStream t = System.out;
		File file = new File("test1.txt");
		byte[] buf = null;
		int temp=0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			if(!file.exists())file.createNewFile();
			
			fis = new FileInputStream(file);
//			fos = new FileOutputStream(file);
//			fos.write(new byte[]{1,2,3,4,5,6,7,8,9});
//			fos.write(new byte[]{11,12,13,14,15,16,17,18,19});
//			while(true){
////				buf = new byte[10];
////				temp = fis.read(buf);
//				temp = fis.read();
//				if(temp==-1)break;
////				for(byte b : buf){
////					System.out.print(b+" ");
////				}
//				System.out.print(temp+" ");
//			}
//			while(true){
//				temp = fis.read();
//				if(temp==-1)break;
//				System.out.print(temp+" ");
//			}
//			buf = new byte[10];
//			while((temp=fis.read(buf))!=-1){
//				byte[] by = new byte[temp];
//				for(int i=0; i<temp; i++){
//					by[i]=buf[i];
//				}
//				for(byte tmp:by){
//					System.out.print(tmp+" ");
//				}
//			}
			buf = new byte[10];
			while((temp=fis.read(buf,0,buf.length))!=-1){
				byte[] by = new byte[temp];
				for(int i=0; i<temp; i++){
					by[i]=buf[i];
				}
				for(byte tmp:by){
					System.out.print(tmp+" ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
			if(fos!=null)fos.close();
			if(fis!=null)fis.close();
			}catch(Exception e){}
		}

	}

}









