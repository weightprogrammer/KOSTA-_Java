package kosta.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class Mission {

	public static void main(String[] args) {
		
		Copyutil c = new Copyutil();
		
		
		// 1.바이트스트림을 이용하여 파일 복사  구현하세요
		File source= new File( "C:\\Users\\박재상\\Desktop\\중간테스트");
		File dest = new File( "C:\\Users\\박재상\\new_211");
		
		
		try {
			Copyutil.copyDirectory(source, dest);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
