package com.tcp.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) {
		ServerSocket serv = null;
		byte[] buf = new byte[10];
		int cnt=0;
		try {
			serv = new ServerSocket(5050);
			
			Socket sock = serv.accept();
			OutputStream os = sock.getOutputStream();
			InputStream is = sock.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("수신된 메시지:"+msg);
			
//			while((cnt=is.read(buf))!=-1){
//				String msg = new String(buf);
//				System.out.println(msg);
//			}
			
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}


















