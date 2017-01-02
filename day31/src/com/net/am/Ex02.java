package com.net.am;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		// 
		try {
			URL url = new URL("http://www.kma.go.kr/index.jsp");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());//도메인에 명시된 포트
			System.out.println(url.getDefaultPort());//통신에 사용되는 포트
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println("--------------");
			InputStream io = url.openStream();
			InputStreamReader isr = new InputStreamReader(io);
			BufferedReader br = new BufferedReader(isr);
			int r=0;
			while((r=br.read())!=-1){
				System.out.print((char)r);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
