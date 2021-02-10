package kosta.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

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
				writer.println(str);
				writer.flush();
			}
			System.out.println("클라이언트 종료");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}