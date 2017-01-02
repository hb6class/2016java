package com.io.pm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		// 
		File file = new File("./temp1.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Vector vec1 = new Vector();
		vec1.addElement(new String("���ڿ�one"));
		vec1.addElement(new String("���ڿ�2"));
		vec1.addElement(new String("���ڿ���"));
		Vector vec2 = new Vector();
		vec2.addElement(new String("���ͻ��"));
		vec2.addElement(vec1);
		vec2.addElement(new Integer(1000));
		
		oos.writeObject(vec2);
		oos.reset();
		System.out.println("�����Է¼���");
		oos.close();
		fos.close();
	}

}




















