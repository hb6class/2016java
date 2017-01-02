package com.sock.obj;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class ObjCl {

	public static void main(String[] args) {
		
		try {
			Socket sock = new Socket("203.236.209.196",5050);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			String d = (String)ois.readObject();
			System.out.println(d.toString());
			ois.close();
			is.close();
			sock.close();
		} catch (Exception e) {
		}
	}

}







