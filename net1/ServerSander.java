package kosta.net1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSander extends Thread {
	
	Socket socket;
	
	public void ServerSender() {}
	
	
	
	public ServerSander(Socket socket) {
		super();
		this.socket = socket;
	}



	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String str = br.readLine();
				if(str.equals("bye")) break;
				writer.println(str);
				writer.flush();
			}
			System.out.println("서버종료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
