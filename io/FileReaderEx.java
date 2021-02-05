package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderEx {

	public static void main(String[] args) {
		//파일에 문자 데이터를 읽기위해서
		FileReader reader = null;
		char arr[] = new char[10];
		
		try {
			reader =new FileReader("pem");
			Arrays.fill(arr, ' ');
			while(true) {
			int	data = reader.read(arr);
			if(data == -1) {
				break;
				}
			System.out.println(arr);
			}
			
			
			
			
			
			while(true) {
				int data = reader.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {}
			
		}
	}

}
