package kosta.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import kosta.net2.ServerSender;

public class ServerEx {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;

		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("서버 실행중");
			socket = serverSocket.accept();
			
			Thread receive = new ServerReceive(socket);
			Thread sender = new ServerSender(socket);
			
			receive.start();
			sender.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (Exception e2) {}
			
			
		}
	}

}
