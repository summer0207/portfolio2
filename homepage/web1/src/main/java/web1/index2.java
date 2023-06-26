package web1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class index2 {

	public static void main(String[] args) throws Exception {
		File f = new File("test.txt"); //txt파일을 프로젝트폴더 web1에 넣어두면 로드가능
		
		InputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is,Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);
		
		String result;
		while((result = br.readLine()) != null) {
			System.out.println(result);			
		}
		is.close();
		isr.close();
		br.close();
		/*
		char b[] = new char[100];
		isr.read(b);
		*/
		
	}

}
