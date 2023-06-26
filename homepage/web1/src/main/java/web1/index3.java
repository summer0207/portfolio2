package web1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class index3 {
	//output - FileWriter 기본
	//OutputStream
	//BufferedWriter
	//PrintWriter
	//FileOutputStream
	//DataOutputStream
	public static void main(String[] args) throws Exception{
		File f = new File("write.txt");
		OutputStream os = new FileOutputStream(f);
		/*
		byte a[] = {1,2,3,4,5};
		os.write(a[2]);
		 */
		OutputStreamWriter ow = new OutputStreamWriter(os,Charset.forName("UTF-8"));
		/*
		String data = "홍길동";
		ow.write(data);
		 */
		BufferedWriter bw = new BufferedWriter(ow);
		String data = "강감찬!! 고객님 정보파일!!!! 입니다.";
		bw.write(data);	//기존데이터 지우고 데이터추가
		String data2 = "홍길동 정보도 확인";
		bw.write(data2);
		//bw.append("홍길동");	//기존데이터 유지하고 간단한데이터를 추가할때 사용(write가 있어야 사용가능)
		bw.flush();	//메모리에 남아있는 데이터 출력
		bw.close();
		ow.close();
		os.close();
	}

}
