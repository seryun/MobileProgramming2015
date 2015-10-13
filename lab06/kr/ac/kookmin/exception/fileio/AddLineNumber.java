package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber {
	public static void main(String[] args) {
	       try {
			BufferedReader inputStream =  new BufferedReader(new FileReader("/Users/seryun/Documents/workspace/Lab6/src/kr/ac/kookmin/exception/fileio/original.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("numbered.txt"));
			for(int s=0;s<6;s++){
				String a = inputStream.readLine();
				a=s +' '+a+'\n';
				outputStream.write(a);
			}
			inputStream.close();
			outputStream.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
