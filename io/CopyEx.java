package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CopyEx {

	public static void main(String[] args) {
		
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[100];
		
		try {
			reader = new FileReader("pem");
			writer =new FileWriter("pem2");
			
			reader.read(arr);
			writer.write(arr);
			
			System.out.println("บนป็");
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						writer.close();
						reader.close();
			} catch (Exception e2) {}
			
			}
		}
	
	}
