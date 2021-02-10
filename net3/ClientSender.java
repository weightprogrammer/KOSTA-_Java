package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;

public class ClientSender extends Thread {
	Socket socket;
	
	public ClientSender() {}	

	public ClientSender(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String str = br.readLine();
				if(str.equals("bye")) break;
				String str2 = URLEncoder.encode(str, "utf-8");
				writer.println(str2);
				writer.flush();
			}
			System.out.println("클라이언트 종료");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}