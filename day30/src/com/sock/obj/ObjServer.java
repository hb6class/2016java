package com.sock.obj;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ObjServer {

	public static void main(String[] args) {
		ServerSocket server=null;
		try {
			server = new ServerSocket(5050);
			while(true){
				Socket sock = server.accept();
				System.out.println(sock.getInetAddress());
				InputStream is = sock.getInputStream();
				OutputStream os = sock.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(new String("강사피씨에서 보내는 메시지 입니다"));
				oos.flush();
				oos.close();
				os.close();
				sock.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
