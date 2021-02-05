package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Copyutil {

	public static void copyDirectory(File source, File dest) throws Exception {
		dest.mkdir(); //디렉토리 생성
		
		//목록을 빼기 위하여 배열 생성 
		File[] file = source.listFiles();
		
		//배열을 출력
		for(int i = 0; i< file.length; i+=1) {
			File sourceFile = file[i];
			
			//디렉토리라면 디렉토리를 복사
			if(sourceFile.isDirectory()) {
				//copy 하기 전에 dest(kosta2에 복사할 공간을 만들어주기 위해 객체를 생성
				
				File s_destFile = new File(dest, source.getName());
				copyDirectory(sourceFile, s_destFile);
			}else { //d아니라면 파일을 복사
				File destFile = new File(dest, source.getName());
				copyFile(sourceFile, destFile);
			}
		}
	}
	
	// 바이트 값을 가진 파일을 복사
	public static void copyFile(File source,File dest) throws Exception{
		
		int count = 0;
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		byte[] arr = new byte[500];
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			
			
			while((count = in.read(arr)) != -1){
				out.write(arr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {

			}

		}

	}

	
		// TODO Auto-generated method stub
		
	
}
