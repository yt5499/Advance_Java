package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteStreamDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			input = new FileInputStream("/home/yash/Desktop/src.txt");
			output = new FileOutputStream("/home/yash/Desktop/dst.txt");
			
//			read a byte at-a-time, if it is reached at the end of the file, return -1;
			int content;
			while((content = input.read()) != -1) {
				output.write((byte)content);
			}
			
		} finally {
			if(input != null) {
				input.close();
			}
			if(output != null) {
				output.close();
			}
		}

	}

}
