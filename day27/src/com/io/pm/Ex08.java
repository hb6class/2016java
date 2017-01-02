package com.io.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex08 {

	public static void main(String[] args) throws Exception {
		File file = new File("./temp1.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Student> arr = (ArrayList<Student>)ois.readObject();
		for(Student stu : arr){
			System.out.println(stu.no +"/"+stu.kor+"/"+stu.eng+"/"
								+stu.math+"="+stu.sum());
		}
		ois.close();
		fis.close();
	}

}


















