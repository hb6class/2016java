package com.sock.eco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EcoCl {

	public static void main(String[] args) {
		System.out.println("client start...");
		Scanner sc = new Scanner(System.in);
		try {
			Socket sock = new Socket("203.236.209.193",5050);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			InputStreamReader isr = new InputStreamReader(is);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedReader br = new BufferedReader(isr);
			BufferedWriter bw = new BufferedWriter(osw);
			while(true){
				System.out.print("\n>>>");
				bw.write(sc.nextLine()+"\n");
				bw.flush();
				
				String msg=br.readLine();
				System.out.println(msg);
				if(msg.equals("exit"))break;
			}
			br.close();
			bw.close();
			isr.close();
			osw.close();
			is.close();
			os.close();
		} catch (Exception e) {
		}
	}

}
