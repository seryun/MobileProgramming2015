package kc.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Trade  {
	public void readFile() {
	  FileInputStream instream=null;
	  
		try {
		   instream = new FileInputStream("/Users/seryun/Documents/workspace/Lab6/src/kc/ac/kookmin/exception/intro/a.txt");
			if (instream != null) {
			  InputStreamReader inputreader = new InputStreamReader(instream);
			  @SuppressWarnings("resource")
			BufferedReader buffreader = new BufferedReader(inputreader);
			 String line="";
			  while(line!=null){
			    line = buffreader.readLine();
			    if(line!=null){
			    System.out.println(line);
			    }
			  }
			}
		
			} catch (Exception ex) {
			   
			} finally {
				try {
					instream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
  }
}
public class Test {
	public static void main(String args[]) {
    	Trade a = new Trade();
    	a.readFile();
    }
}
