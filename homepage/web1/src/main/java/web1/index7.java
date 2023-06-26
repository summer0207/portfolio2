package web1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class index7 {
	//이미지,동영상 => byte
	
	public static void main(String[] args) throws Exception {
		/*
		File f = new File("kang.jpg");
		InputStream is = new FileInputStream(f);
		
		byte a[] = new byte[is.available()];
		//byte a[] = new byte[(int)f.length()];
		//System.out.println(is.read(a));	//용량
		//File cp = new File("test.jpg");
		OutputStream os = new FileOutputStream("test.jpg");
		int w;
		while((w=is.read(a))!=-1) {
			os.write(a, 0, w);
		}
		os.close();
		is.close();
		 */
		/*
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.read());	//용량
		 */
		/* ---------------------------------------------*/
		File f = new File("kang.jpg");
		DataInputStream ds = new DataInputStream(new FileInputStream(f));
		byte a[] = new byte[ds.available()];		
		ds.readFully(a);	//이미지 전체 파일을 읽어드림 (반복문 없이 적용)
		
		FileOutputStream os = new FileOutputStream("test2.jpg");
		os.write(a);
		os.close();
		ds.close();
	}
}
