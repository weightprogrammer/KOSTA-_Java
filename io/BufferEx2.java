package kosta.io;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx2 {

	public static void main(String[] args) {
		// 입출력 스트림이요 스캐너 사용X
		// System.in : InputStream =>InputStreamReader =>BufferedReader
		
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		try {
			
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			for(int i ='1'; i<='9';i++) {
				bos.write(i);
			}
			
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
