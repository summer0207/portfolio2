package web1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class index4 {
	//input & output 응용편
	/*
	 test.txt에 있는 내용을 write.txt로 내용이 복사 되도록 하시오. 
	 */
	public static void main(String[] args) throws Exception {
		File f = new File("test.txt");
		File w = new File("write.txt");
		
		InputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream(w);
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		
		String result;
		while((result = br.readLine())!= null) {
			//System.out.println(result);
			bw.write(result+"\n");
		}
		bw.flush();
		os.close();
		bw.close();
		br.close();
		is.close();

	}

}
