package kosta.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class io_ex {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSRc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read())!=-1)
			output.write(data);
		
		outSRc = output.toByteArray();
		
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSRc));
	}

}
