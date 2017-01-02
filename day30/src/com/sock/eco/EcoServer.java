package com.sock.eco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EcoServer {

	public static void main(String[] args) {
		System.out.println("EcoServer start...");
		int port=5050;
		ServerSocket server=null;
		try {
			server = new ServerSocket(port);
			while(true){
				Socket sock = server.accept();
				InputStream is = sock.getInputStream();
				OutputStream os = sock.getOutputStream();
				InputStreamReader isr = new InputStreamReader(is);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(osw);
				while(true){
					String msg = br.readLine();
					bw.write("re:"+msg+"\n");
					bw.flush();
					if(msg.equals("exit"))break;
					System.out.println(msg);
				}
				System.out.println("server end");
				br.close();
				bw.close();
				isr.close();
				osw.close();
				is.close();
				os.close();
			}
			
		} catch (IOException e) {
		}
	}

}










