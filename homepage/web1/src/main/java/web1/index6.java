package web1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class index6 {
	//PrintWriter = FileWriter + OutputStreamWriter
	//File 클래스를 사용하지 않고 가능 (장점)
	//단점 : 추가 데이터를 사용하지 못함 (true 사용불가)
	
	public static void main(String[] args) throws Exception {
		//PrintWriter 단독사용
		/*
		String url = "write.txt";
		String enc = "UTF-8";
		PrintWriter pw = new PrintWriter(url,enc);
		pw.write("이순신 고객정보");
		pw.write("강감찬 고객정보");
		pw.close();
		*/
		String url = "write.txt";
		/*
		FileWriter fw = new FileWriter(url,true);
		PrintWriter pw = new PrintWriter(fw);
		*/
		PrintWriter pw = new PrintWriter(new FileWriter(url,true));
		pw.write("\n홍길동 고객정보");
		pw.close();
		
	}

}
