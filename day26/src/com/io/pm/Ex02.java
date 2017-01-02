package com.io.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// 
		File file1 = new File("test.txt");
		File file2 = new File("test2.txt");
		
		if(!file2.exists())
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		int read=0;
		int cnt=0;
		int tot=5956*1024;
		byte[] buf = new byte[50];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
//			while((read=fis.read())!=-1){
//				fos.write(read);
//			}
//			while((read=fis.read(buf))!=-1){
//				cnt+=50;
//				if(cnt*100/tot>=98)System.out.println("100%진행");
//				else if(cnt*100/tot>=50)System.out.println("50%진행");
//				else if(cnt*100/tot>=25)System.out.println("25%진행");
//				fos.write(buf,0,read);
////				fos.write(buf);
//			}
			while((read=bis.read())!=-1){
				bos.write(read);
			}
//			while((read=bis.read(buf,0,buf.length))!=-1){
//				bos.write(buf,0,read);
//			}
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
			if(fos!=null)fos.close();
			if(fis!=null)fis.close();
			}catch(Exception e){}
//			file1.delete();
		}
		
	}

}











