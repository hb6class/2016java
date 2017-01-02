package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		File file = new File("./temp1.txt");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Vector vec1 = (Vector)ois.readObject();
//		Enumeration em = vec1.elements();
//		while(em.hasMoreElements()){
//			System.out.println(em.nextElement());
//		}
//		vec2.addElement(new String("백터사용"));
//		vec2.addElement(vec1);
//		vec2.addElement(new Integer(1000));
		
		String st1 = (String)vec1.get(0);
		System.out.println(st1);
		Vector vec2 = (Vector)vec1.get(1);
		Iterator ite = vec2.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		Integer st3 = (Integer)vec1.get(2);
		System.out.println(st3.intValue());
	}

}













