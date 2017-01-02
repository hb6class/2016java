package com.tcp.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		// 
//		byte[] buf = "자바".getBytes();
		try {
			Socket sock = new Socket("203.236.209.193",5050);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("엔터를 안찍어도 찍은 것과 같습니다");
			
//			bw.write("tcp채팅구현 쉬워요\n");
//			bw.flush();
			bw.close();
//			os.write(buf);
//			os.flush();
			os.close();
			is.close();
			sock.close();
			System.out.println("client end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}












